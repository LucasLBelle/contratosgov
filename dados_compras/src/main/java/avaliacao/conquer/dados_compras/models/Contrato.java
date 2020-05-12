package avaliacao.conquer.dados_compras.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity(name="contrato")
public class Contrato {

	@Id
	private String identificador;
	private String cnpj_contratada;
	private String codigo_contrato;
	private String cpfContratada;
	
	@Type(type="date")
	private Date data_assinatura;
	
	@Type(type="date")
	private Date data_inicio_vigencia;
	
	@Type(type="date")
	private Date data_termino_vigencia;
	
	private String fundamento_legal;
	private String licitacao_associada;
	private Integer modalidade_licitacao;
	private Integer numero;
	private Integer numero_aditivo;
	private Integer numero_aviso_licitacao;
	private String numero_processo;
	private String objeto;
	private String origem_licitacao;
	private Integer uasg;
	private Double valor_inicial;
	
//	@OneToOne
//	private Links _links;
	
	public Contrato() {
		
	}
	
	public Contrato(String identificador) {
		this.identificador = identificador;
	}

	public Contrato(String identificador, String cnpj_contratada, String codigo_contrato, String cpfContratada,
			Date data_assinatura, Date data_inicio_vigencia, Date data_termino_vigencia, String fundamento_legal,
			String licitacao_associada, Integer modalidade_licitacao, Integer numero, Integer numero_aditivo,
			Integer numero_aviso_licitacao, String numero_processo, String objeto, String origem_licitacao,
			Integer uasg, Double valor_inicial, Links _links) {
		this.identificador = identificador;
		this.cnpj_contratada = cnpj_contratada;
		this.codigo_contrato = codigo_contrato;
		this.cpfContratada = cpfContratada;
		this.data_assinatura = data_assinatura;
		this.data_inicio_vigencia = data_inicio_vigencia;
		this.data_termino_vigencia = data_termino_vigencia;
		this.fundamento_legal = fundamento_legal;
		this.licitacao_associada = licitacao_associada;
		this.modalidade_licitacao = modalidade_licitacao;
		this.numero = numero;
		this.numero_aditivo = numero_aditivo;
		this.numero_aviso_licitacao = numero_aviso_licitacao;
		this.numero_processo = numero_processo;
		this.objeto = objeto;
		this.origem_licitacao = origem_licitacao;
		this.uasg = uasg;
		this.valor_inicial = valor_inicial;
		//this._links = _links;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCnpj_contratada() {
		return cnpj_contratada;
	}

	public void setCnpj_contratada(String cnpj_contratada) {
		this.cnpj_contratada = cnpj_contratada;
	}

	public String getCodigo_contrato() {
		return codigo_contrato;
	}

	public void setCodigo_contrato(String codigo_contrato) {
		this.codigo_contrato = codigo_contrato;
	}

	public String getCpfContratada() {
		return cpfContratada;
	}

	public void setCpfContratada(String cpfContratada) {
		this.cpfContratada = cpfContratada;
	}

	public Date getData_assinatura() {
		return data_assinatura;
	}

	public void setData_assinatura(Date data_assinatura) {
		this.data_assinatura = data_assinatura;
	}

	public Date getData_inicio_vigencia() {
		return data_inicio_vigencia;
	}

	public void setData_inicio_vigencia(Date data_inicio_vigencia) {
		this.data_inicio_vigencia = data_inicio_vigencia;
	}

	public Date getData_termino_vigencia() {
		return data_termino_vigencia;
	}

	public void setData_termino_vigencia(Date data_termino_vigencia) {
		this.data_termino_vigencia = data_termino_vigencia;
	}

	public String getFundamento_legal() {
		return fundamento_legal;
	}

	public void setFundamento_legal(String fundamento_legal) {
		this.fundamento_legal = fundamento_legal;
	}

	public String getLicitacao_associada() {
		return licitacao_associada;
	}

	public void setLicitacao_associada(String licitacao_associada) {
		this.licitacao_associada = licitacao_associada;
	}

	public Integer getModalidade_licitacao() {
		return modalidade_licitacao;
	}

	public void setModalidade_licitacao(Integer modalidade_licitacao) {
		this.modalidade_licitacao = modalidade_licitacao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero_aditivo() {
		return numero_aditivo;
	}

	public void setNumero_aditivo(Integer numero_aditivo) {
		this.numero_aditivo = numero_aditivo;
	}

	public Integer getNumero_aviso_licitacao() {
		return numero_aviso_licitacao;
	}

	public void setNumero_aviso_licitacao(Integer numero_aviso_licitacao) {
		this.numero_aviso_licitacao = numero_aviso_licitacao;
	}

	public String getNumero_processo() {
		return numero_processo;
	}

	public void setNumero_processo(String numero_processo) {
		this.numero_processo = numero_processo;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getOrigem_licitacao() {
		return origem_licitacao;
	}

	public void setOrigem_licitacao(String origem_licitacao) {
		this.origem_licitacao = origem_licitacao;
	}

	public Integer getUasg() {
		return uasg;
	}

	public void setUasg(Integer uasg) {
		this.uasg = uasg;
	}

	public Double getValor_inicial() {
		return valor_inicial;
	}

	public void setValor_inicial(Double valor_inicial) {
		this.valor_inicial = valor_inicial;
	}

//	public Links get_links() {
//		return _links;
//	}
//
//	public void set_links(Links _links) {
//		this._links = _links;
//	}
	
	
}
