
public class StudentData {
	private String vardas;
	final private int ID, Metai;
	
	public StudentData(String vardas, final int ID, final int Metai) {
		this.vardas = vardas;
		this.ID = ID;
		this.Metai = Metai;
	}
	public String getVardas() {
	return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public int getId() {
		return ID;
	}
	public int getMetai() {
		return Metai;
	}
	public void spausdink() {
		System.out.println("Id: "+ getId()+", Vardas: " + getVardas() + ", Metai: " + getMetai());
	}
//	public void setId(int ID) {
//		this.ID = ID;
//	}
//	public void setMetai(int Metai) {
//		this.Metai = Metai;
//	}
}
