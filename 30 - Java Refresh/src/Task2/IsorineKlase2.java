package Task2;

public class IsorineKlase2 {
	private static String pavadinimas;
	protected  String nr;
	static int sk;

	public class VidineKlase2 {
		static int sk = 7;
		public static void spausdinti() {
			System.out.println("Vidinis sk: " + sk);
			System.out.println("Isorinis: " + pavadinimas);
			System.out.println("Isorinis sk: " + IsorineKlase2.sk);
		}
	}
	@SuppressWarnings("static-access")
	public void nustatyti(String name, String nr, int sk) {
		pavadinimas = name;
		this.nr = nr;
		this.sk = sk;
	}
}
