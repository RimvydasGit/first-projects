import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
	//Turi sarasa su keltu string elementu, pasalina vienodos reiksmes elementus jei tokiu yra.
	public static ArrayList<String> removesame(ArrayList<String> sarasas) {
		int m1koef = 0;
		

		while (m1koef < sarasas.size()) {		
			int m2koef = 0;
			int rcoef = 0;
			while (m2koef < sarasas.size()) {	
					if (sarasas.get(m1koef).equals(sarasas.get(m2koef))) rcoef ++;
					if (rcoef == 2) {
						sarasas.remove(m1koef);
						rcoef = 0;}
					m2koef++;	
				}
			m1koef++;
		}
		return sarasas;
		
	}
	//Sukurti string tipo elementus galinti saugoti sarasa. I sarasa ideti keleta elementu.Rasti ilgiausia zodi.
	public static String ilgzodis(ArrayList<String> sarasas) {
		int m1koef = 0;
		int zilgis = 0;
		String zodis = "";
		
		while (m1koef < sarasas.size()) {
			zodis = sarasas.get(m1koef);
			
			if (zilgis < zodis.length())zilgis = zodis.length();
			
			m1koef++;
		}
		int m2koef = 0;
		String ilgiausiaszodis = "";
		
		while (m2koef < sarasas.size()) {
			zodis = sarasas.get(m2koef);
			
			if (zilgis == zodis.length())ilgiausiaszodis = sarasas.get(m2koef);
			
			m2koef++;
		}
		return ilgiausiaszodis;
	}
	
	//Sukurti String tipo elementus galinti saugoti sarasa
	//Vartotojas ivedineja zodzius, kuriuos programa deda i sarasa
	//Po ivedimo atspausdinamas visas sarasas
	//Jei saraso dydis tampa 5, tada sarasas isvalomas ir toliau dedama i tuscia sarasa
	//Jei dedant paaiskeja, kad toks elementas jau yra tada spausdinamas klaidos pranesimas ir toliau laukiama kitu zodziu.
	public static void saugykla() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veskite zodzius, zodis N = stabdymui:");
		String saugok = sc.next();
		ArrayList<String> sarasas = new ArrayList<>();
		sarasas.add(saugok);
		Utils.klaida(sarasas);
		if (sarasas.size() > 5) sarasas.clear(); 
	}
	public static String klaida(ArrayList<String> sarasas) {
		int m1koef = 0;
		String klaida = "";

		while (m1koef < sarasas.size()) {		
			int m2koef = 0;
			int rcoef = 0;
			while (m2koef < sarasas.size()) {	
					if (sarasas.get(m1koef).equals(sarasas.get(m2koef))) rcoef ++;
					if (rcoef == 2) {
						sarasas.remove(m1koef);
						rcoef = 0;
						return klaida = "Klaida";
						}
					m2koef++;	
				}
			m1koef++;
		}
		return "";
	}
		
}
