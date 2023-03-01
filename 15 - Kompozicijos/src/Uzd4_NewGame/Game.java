package Uzd4_NewGame;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	static ArrayList<String> miestai = new ArrayList<>();
	
	

	public static void uzpildyk() {
		miestai.add("Vilnius");
		miestai.add("Varsuva");
		miestai.add("Londonas");
		miestai.add("Hanoveris");
		miestai.add("Milanas");
		miestai.add("Valencija");
		miestai.add("Amsterdamas");
		miestai.add("Briuselis");
		miestai.add("Ryga");
		miestai.add("Liuksenburgas");
		miestai.add("Viena");
		miestai.add("Paryzius");
		miestai.add("Roma");
		miestai.add("Talinas");
		miestai.add("Reikjevikas");
		miestai.add("Madridas");
		miestai.add("Helsinkis");
		miestai.add("Kijevas");
		miestai.add("Kaunas");
		miestai.add("Atenai");
	}

	public static String miestas() {
		Random rnd = new Random();
		uzpildyk();
		return miestai.get(rnd.nextInt(0, 19));
	}

	public static String zodish(String miestas) {
		int ilgis = miestas.length();
		char first = miestas.charAt(0);
		char last = miestas.charAt(ilgis - 1);
		String zodis;
		int ilgis2 = ilgis;
		zodis = "" + first;
		while (ilgis2 > 2) {
			zodis = zodis + "*";
			ilgis2 = (ilgis2 - 1);
		}
		return zodis + last;
	}

public static String duzodziai(String pirmas, String antras, char raide) {
	
	int vieta = -1;
	char arYra = 0 ;
	for (int a = 0;a < pirmas.length();a++) {
		if (pirmas.charAt(a) == raide) {
			arYra = raide;
			vieta = a;
		}
		
	}
		if((vieta != (-1)) && (antras.charAt(vieta) != raide)) {
		return	antras = antras.substring(0, vieta) + arYra + antras.substring(vieta + 1);
		}
		else { return "Tokios raides nera";
		}
	

}
}
