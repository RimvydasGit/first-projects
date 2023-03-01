import java.util.*;

public class Utils {
	/// Priima komandas,
	// ivesti zodi i sarasa.
	// Rasti zodi- randa ir atspausdina
	/// trinti zodi - paklausia koki zodi istrinti ir istrina
	/// isvalyti sarasa
	// baigti programa
	public static void komandos() {

		Scanner sc = new Scanner(System.in);

		String zodis = "";
		if (zodis.equals("")) {
			System.out.println("Iveskite komanada:");
			zodis = sc.nextLine().trim();

		}

		ArrayList<String> arrlist = new ArrayList<>();
		zodis = Utils.spausdink(arrlist, zodis);
		while (!zodis.equalsIgnoreCase("Baigti programa")) {

			if (zodis.equalsIgnoreCase("ivesti zodi")) {
				System.out.println("Iveskite zodi:");
				arrlist.add(sc.nextLine());
				System.out.println("Iveskite komanda:");
				zodis = sc.nextLine().trim();
				zodis = Utils.spausdink(arrlist, zodis);
				continue;
			}
			if (zodis.equalsIgnoreCase("rasti zodi")) {
				System.out.println("Iveskite zodi:");
				zodis = sc.nextLine().trim();
				Utils.spausdink(arrlist, zodis);
				if (Utils.lyguszodis(arrlist, zodis)) {
					System.out.println(zodis + " - Egzistuoja sarase");
					System.out.println("Iveskite komanda:");
					zodis = sc.nextLine().trim();
					zodis = Utils.spausdink(arrlist, zodis);
					continue;
				} else {
					System.out.println(zodis + " - Nera sarase");
					System.out.println("Iveskite komanda:");
					zodis = sc.nextLine().trim();
					zodis = Utils.spausdink(arrlist, zodis);
					continue;
				}
			}
			if (zodis.equalsIgnoreCase("Isvalyti sarasa")) {
				arrlist.clear();
				System.out.println("Iveskite komanda:");
				zodis = sc.nextLine().trim();
				zodis = Utils.spausdink(arrlist, zodis);
				continue;

			}
			if (zodis.equalsIgnoreCase("Trinti zodi")) {
				System.out.println("Trinamas zodis:");
				zodis = sc.nextLine().trim();
				Utils.trintizodi(arrlist, zodis);
				System.out.println("Iveskite komanda:");
				zodis = sc.nextLine().trim();
				zodis = Utils.spausdink(arrlist, zodis);
				continue;
			}
		}
	}

	public static boolean lyguszodis(ArrayList<String> sarasas, String a) {
		int m1koef = 0;

		String zodis = "";

		while (m1koef < sarasas.size()) {
			zodis = sarasas.get(m1koef);

			if (zodis.equalsIgnoreCase(a))
				return true;

			m1koef++;
		}

		return false;
	}

	public static ArrayList<String> trintizodi(ArrayList<String> sarasas, String a) {
		int m1koef = 0;
		String zodis = a;
		while (m1koef < sarasas.size()) {
			if (zodis.equalsIgnoreCase(sarasas.get(m1koef)))
				sarasas.remove(m1koef);

			m1koef++;
		}

		return sarasas;
	}

	public static String spausdink(ArrayList<String> sarasas, String a) {
		Scanner sc = new Scanner(System.in);
		if (a.equalsIgnoreCase("Spausdink")) {
			System.out.println(sarasas);
			System.out.println("Iveskite komanda: ");
			return sc.nextLine().trim();
		} else
			return a.trim();

	}

}
