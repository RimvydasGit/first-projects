
public class TPVCADraudimas extends AutomobilioDraudimas{
	private String galiojimoTeritorija;//LT,EU..
	public TPVCADraudimas(String apdraustojoVardas, double draudimoSuma, String automobilioValstNr, String galiojimoTeritorija) {
		super(apdraustojoVardas, draudimoSuma, automobilioValstNr);
		this.galiojimoTeritorija = galiojimoTeritorija;
	}
	public String getGaliojimoTeritorija() {
		return galiojimoTeritorija;
	}
	public void setGaliojimoTeritorija(String galiojimoTeritorija) {
		this.galiojimoTeritorija = galiojimoTeritorija;
	}
	
}
