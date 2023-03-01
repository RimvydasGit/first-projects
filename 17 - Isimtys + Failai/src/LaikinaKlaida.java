
public class LaikinaKlaida extends VaziuoklesIsskleidimoKlaida{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String pranesimas = "Laikina klaida";
	public LaikinaKlaida(String pranesimas) {
		super(pranesimas);
		this.pranesimas = this.pranesimas + ": " + pranesimas;
	}

}
