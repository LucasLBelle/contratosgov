package avaliacao.conquer.dados_compras.models;

public class Filtro {

	private String filtro;
	private String uasg;
	private String status;
	private String msg;

	public Filtro(String tp) {
		this.filtro = tp;
		this.uasg = "";
		this.status = "";
		this.msg = "";
	}	
	
	public Filtro(String filtro, String uasg, String status, String msg) {
		super();
		this.filtro = filtro;
		this.uasg = uasg;
		this.status = status;
		this.msg = msg;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
