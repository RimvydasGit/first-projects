
public class Info {
	int id = 0;
	String tekstas = "";
	public Info(int id, String tekstas) {
		super();
		this.id = id;
		this.tekstas = tekstas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTekstas() {
		return tekstas;
	}
	public void setTekstas(String tekstas) {
		this.tekstas = tekstas;
	}
	@Override
	public String toString() {
		return "Info [id=" + id + ", tekstas=" + tekstas + "]";
	}
	public boolean arYraTekste(String zodis) {
		return zodis.contains(tekstas);
	
	}
}
