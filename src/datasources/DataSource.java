package datasources;

public class DataSource {
	private String url;
	private String user;
	private String pass;
	private String nombre_bd;
	public DataSource() {
		// TODO Auto-generated constructor stub
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombre_bd() {
		return nombre_bd;
	}
	public void setNombre_bd(String nombre_bd) {
		this.nombre_bd = nombre_bd;
	}
	@Override
	public String toString() {
		return "DataSource [url=" + url + ", user=" + user + ", pass=" + pass + ", nombre_bd=" + nombre_bd + "]";
	}
	
	
}
