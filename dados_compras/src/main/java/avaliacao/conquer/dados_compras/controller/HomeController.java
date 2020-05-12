package avaliacao.conquer.dados_compras.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import avaliacao.conquer.dados_compras.models.Contrato;
import avaliacao.conquer.dados_compras.models.Filtro;
import avaliacao.conquer.dados_compras.service.ContratoService;

@Controller
public class HomeController {
	
	@Autowired
	private ContratoService service;

	@RequestMapping("/")
	public String index(Model model) {
		//Filtro filtro = new Filtro("cnpj_contratada");
		Filtro filtro = new Filtro("cnpj_contratada", "", "Falhou", "Favor selecionar um filtro e digitar código UASG!");
		model.addAttribute("filtro", filtro);
		return "index";
	}
	
	@RequestMapping(value = "buscadados", method = RequestMethod.POST)
	//@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public String buscaDados(HttpServletRequest request, HttpServletResponse response, @RequestParam("filtro") String filtro, @RequestParam("uasg") String uasg, Model model) throws IOException {
		Filtro retFiltro = null;

		if(null == filtro || null == uasg || "".equals(filtro) || "".equals(uasg)) {
			retFiltro = new Filtro(filtro, uasg, "Falhou", "Favor selecionar um filtro e digitar código UASG!");
			model.addAttribute("filtro", retFiltro);
			return "index";
		}

		try {
			response.setContentType("text/csv;charset=UTF-8");
			response.addHeader("Content-Disposition", "attachment; filename = Contratos_" + uasg  + "AgrupadoPor_" + filtro + ".csv");
			//response.getWriter().write(service.buscarDadosGov(filtro, uasg));

			retFiltro = new Filtro(filtro, uasg, "Sucesso", "Arquivo baixado com sucesso!");
			model.addAttribute("filtro", retFiltro);
		} catch(Exception e) {
			retFiltro = new Filtro(filtro, uasg, "Falhou", "Ocorreu um erro no serviço API GOV. Tente novamente mais tarde!");
			model.addAttribute("filtro", retFiltro);
		}
		return "index";
	}
	
	@RequestMapping(value = "adicionacontrato", method = RequestMethod.POST)
	public String adicionaDados(@RequestParam("identificador") String identificador, Model model) {
		
		Contrato contrato = new Contrato(identificador);
		service.salvar(contrato);
		
		Iterable<Contrato> contratos = service.obterTodos();
		model.addAttribute("contratos", contratos);
		
		return "listacontrato";
	}

	@RequestMapping("removecontrato/{identificador}")
	public String removeCompra(@PathVariable("identificador") String identificador, Model model) {
		
		service.remover(identificador);
		Iterable<Contrato> contratos = service.obterTodos();
		model.addAttribute("contratos", contratos);
		
		return "listacontrato";
	}
	

}
