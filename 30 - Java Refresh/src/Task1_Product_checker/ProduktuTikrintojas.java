package Task1_Product_checker;

import java.util.Scanner;

public class ProduktuTikrintojas {

	public static void main(String[] args) {
		Produktas dn = new Duona();
		patikrinkVienaProdukta(dn, "Duona");
		Produktas jg = new Jogurtas();
		patikrinkVienaProdukta(jg, "Jogurtas");
		Produktas pn = new Pienas();
		patikrinkVienaProdukta(pn, "Pienas");
		Produktas sr = new Suris();
		patikrinkVienaProdukta(sr, "Suris");
		Produktas sv = new Sviestas();
		patikrinkVienaProdukta(sv, "Sviestas");

		tikrinimoProgramele(dn, jg, pn, sr, sv);
	}

	private static void tikrinimoProgramele(Produktas dn, Produktas jg, Produktas pn, Produktas sr, Produktas sv) {
		System.out.println(" ");
		System.out.println("Iseiti spauskite : \" X \"");
		String name = "";
		while (!name.equalsIgnoreCase("x")) {
			name = validProductName();

			if (name.equalsIgnoreCase("Duona"))
				spausdink(name, dn.arGalimaVartoti());
			if (name.equalsIgnoreCase("Jogurtas"))
				spausdink(name, jg.arGalimaVartoti());
			if (name.equalsIgnoreCase("Pienas"))
				spausdink(name, pn.arGalimaVartoti());
			if (name.equalsIgnoreCase("Suris"))
				spausdink(name, sr.arGalimaVartoti());
			if (name.equalsIgnoreCase("Sviestas"))
				spausdink(name, sv.arGalimaVartoti());
		}
	}

	static void patikrinkVienaProdukta(Produktas prod, String name) {
		String pranesimas = prod.arGalimaVartoti() ? "Galima vartoti" : "Negalima Vartoti";
		System.out.println(name + " : " + pranesimas);
	}

	static String validProductName() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Iveskite produkta:");
			String name = sc.next();
			if (name.equalsIgnoreCase("Duona"))
				return "Duona";
			if (name.equalsIgnoreCase("Jogurtas"))
				return "Jogurtas";
			if (name.equalsIgnoreCase("Pienas"))
				return "Pienas";
			if (name.equalsIgnoreCase("Suris"))
				return "Suris";
			if (name.equalsIgnoreCase("Sviestas"))
				return "Sviestas";
			if (name.equalsIgnoreCase("x"))
				return "X";
		}

	}

	static void spausdink(String name, boolean arGalima) {

		if (arGalima)
			System.out.println("Produkta: " + name + ", vartoti Galima");
		else
			System.out.println("Produkta: " + name + ", vartoti Negalima");
	}
}