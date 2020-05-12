package avaliacao.conquer.dados_compras.models;

//@Entity(name="_links")
public class Links{

	private TypeLink self;
	private TypeLink aditivos;
	private TypeLink apostilamentos;
	private TypeLink eventos;
	private TypeLink fornecedor;
	private TypeLink licitacao;
	private TypeLink modalidade_licitacao;
	private TypeLink tipo_contrato;
	private TypeLink uasg;
	
	public Links() {}
	
	public Links(TypeLink self, TypeLink aditivos, TypeLink apostilamentos, TypeLink eventos, TypeLink fornecedor,
			TypeLink licitacao, TypeLink modalidade_licitacao, TypeLink tipo_contrato, TypeLink uasg) {
		super();
		this.self = self;
		this.aditivos = aditivos;
		this.apostilamentos = apostilamentos;
		this.eventos = eventos;
		this.fornecedor = fornecedor;
		this.licitacao = licitacao;
		this.modalidade_licitacao = modalidade_licitacao;
		this.tipo_contrato = tipo_contrato;
		this.uasg = uasg;
	}
	public TypeLink getSelf() {
		return self;
	}
	public void setSelf(TypeLink self) {
		this.self = self;
	}
	public TypeLink getAditivos() {
		return aditivos;
	}
	public void setAditivos(TypeLink aditivos) {
		this.aditivos = aditivos;
	}
	public TypeLink getApostilamentos() {
		return apostilamentos;
	}
	public void setApostilamentos(TypeLink apostilamentos) {
		this.apostilamentos = apostilamentos;
	}
	public TypeLink getEventos() {
		return eventos;
	}
	public void setEventos(TypeLink eventos) {
		this.eventos = eventos;
	}
	public TypeLink getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(TypeLink fornecedor) {
		this.fornecedor = fornecedor;
	}
	public TypeLink getLicitacao() {
		return licitacao;
	}
	public void setLicitacao(TypeLink licitacao) {
		this.licitacao = licitacao;
	}
	public TypeLink getModalidade_licitacao() {
		return modalidade_licitacao;
	}
	public void setModalidade_licitacao(TypeLink modalidade_licitacao) {
		this.modalidade_licitacao = modalidade_licitacao;
	}
	public TypeLink getTipo_contrato() {
		return tipo_contrato;
	}
	public void setTipo_contrato(TypeLink tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}
	public TypeLink getUasg() {
		return uasg;
	}
	public void setUasg(TypeLink uasg) {
		this.uasg = uasg;
	}
	
	
}
