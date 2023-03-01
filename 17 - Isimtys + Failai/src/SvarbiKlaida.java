
public class SvarbiKlaida extends VaziuoklesIsskleidimoKlaida {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String pranesimas = " Svarbi Klaida ";
	public SvarbiKlaida(String pranesimas) {
		super(pranesimas);
		this.pranesimas = this.pranesimas + ": " + pranesimas;
	}

}
