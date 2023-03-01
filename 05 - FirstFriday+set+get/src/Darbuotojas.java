
public class Darbuotojas {
	private int atlyginimas;
	private int darbas;
	
	public Darbuotojas(int atlyginimas, int darbas) {
		super();
		this.atlyginimas = atlyginimas;
		this.darbas = darbas;
	}
	public int getAtlyginimas() {
		return atlyginimas;
	}
	public  void setAtlyginimas(int atlyginimas) {
		this.atlyginimas = atlyginimas;
		
	}
	public int getDarbas() {
		return darbas;
	}
	public  void setDarbas(int darbas) {
		this.darbas = darbas;	
	}
	public void gautiInfo() {
		System.out.println("Darbo valandos: " + darbas + " Darbo atlygis: " + atlyginimas);
		return;
	}
	public void pridetiAtlyginimas() {
			if (atlyginimas <= 500) setAtlyginimas(atlyginimas + 10);
			
	}
	public void pridetiDarba() {
		setAtlyginimas(atlyginimas + darbas * 5);
		
	}
}
