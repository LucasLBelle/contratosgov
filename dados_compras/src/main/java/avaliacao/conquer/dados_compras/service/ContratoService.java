package avaliacao.conquer.dados_compras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import avaliacao.conquer.dados_compras.models.Contrato;
import avaliacao.conquer.dados_compras.repository.ContratoRepository;

@Service
public class ContratoService {
	
	@Autowired
	private ContratoRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Iterable<Contrato> obterTodos() {
		return repository.findAll();
	}
	
	public void salvar(Contrato contrato) {
		repository.save(contrato);
	}

	public void remover(String id) {
		repository.deleteById(id);
	}
	
	public String buscarDadosGov(String filtro, String uasg) {
		String uri = "http://compras.dados.gov.br/contratos/v1/contratos.csv?uasg=" + uasg + "&order_by=" + filtro; 
		return restTemplate.getForObject(uri, String.class);
	} 
}
