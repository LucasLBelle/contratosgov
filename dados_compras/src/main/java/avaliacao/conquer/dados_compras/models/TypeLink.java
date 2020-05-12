package avaliacao.conquer.dados_compras.models;

public class TypeLink {

	private String href;
	private String title;
	
	public TypeLink() {
		
	}
	
	public TypeLink(String href, String title) {
		this.href = href;
		this.title = title;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
