
public class Utils {
	public String vardas;
	public String pavarde;
	
	public Utils(String v, String p) {
		vardas = v;
		pavarde = p;
		
	}
	public void prisistatyk( ) {
		System.out.println("Labas as esu: " + vardas + " " + pavarde);
	}
	public String getName( ) {
		return vardas;
	}
	public String getSurename() {
		return pavarde;
	}
	////
	public static void m1() {
		System.out.println("Pirmas metodas");
		m2();
	}
	public static void m2() {
		System.out.println("Antras metodas");
		m3();
	}
	public static void m3() {
		System.out.println("Antras metodas");
	}
	///
	public static void spausdink(String vardas, String pavarde, String kalba, int savaiciu) {
		System.out.println(" As " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " + kalba +
				" per " + savaiciu + " savaiciu.");
	
	}
	public static void spausdink(String vardas, String pavarde, String kalba) {
		System.out.println(" As " + vardas + " " + pavarde + ", tikrai ismoksiu programuoti " );
	
	}
////
}
