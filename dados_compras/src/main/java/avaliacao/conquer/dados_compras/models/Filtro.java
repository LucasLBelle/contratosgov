package avaliacao.conquer.dados_compras.models;

public class Filtro {

	private String filtro;
	private String uasg;
	private String type;
	private String message;
	
	public Filtro() {
		this.filtro = "";
		this.uasg = "";
		this.type = "";
		this.message = "";
	}

	public Filtro(String tp) {
		this.filtro = tp;
		this.uasg = "";
		this.type = "";
		this.message = "";
	}	
	
	public Filtro(String filtro, String uasg, String status, String msg) {
		super();
		this.filtro = filtro;
		this.uasg = uasg;
		this.type = status;
		this.message = msg;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String tp) {
		this.filtro = tp;
	}

	public String getUasg() {
		return uasg;
	}

	public void setUasg(String uasg) {
		this.uasg = uasg;
	}

	public String getType() {
		return type;
	}

	public void setType(String status) {
		this.type = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String msg) {
		this.message = msg;
	}
	
}
