package Uzduotys;

import java.time.temporal.ValueRange;

public class Utils {
///Gauna eilute grazina zodziu skaiciu
		public static int zskaicius(String zodziai) {
			int zsk, index;
			zsk = 1; 
			zodziai = zodziai.trim();
				if (zodziai.isBlank()) { 
				zsk = 0;}
				else {
					for(; (zodziai.indexOf(" ") != (-1));) {
						if (zodziai.indexOf(" ") != (-1)) {
							zodziai = zodziai.substring((zodziai.indexOf(" ")),(zodziai.length()) ) ;
							zodziai = zodziai.trim();
							zsk = zsk + 1;
							}
					}
				}
				return zsk;
		}
		
////Gauna dvi eilutes, grazina true, jei abiejose du paskutiniai simboliai sutampa kitu atveju grazina false
		public static boolean dviEilutes(String pirmaEil, String antraEil) {
		int a, b;
		a = pirmaEil.length();
		b = antraEil.length();
		//System.out.println(pirmaEil.charAt((a-2)));
		if (pirmaEil.charAt((a-1)) + pirmaEil.charAt((a-2)) == antraEil.charAt((b-1)) + antraEil.charAt((b-2)))
			return true;
		else return false;
		}
////Gauna skaiciu masyva ir skaiciu n.Grazina true jei masyve yra didesnis skaicius nei n.False - jei nera.
		public static boolean arDidesnis(int n, int ...masyvas) {
		int b = (masyvas.length - 1);
			for (int i = 0; i <= b ; b--) {
				if (n < masyvas[b]) return true;
			}
		return false;
		}
/////Gauna eilute pvz "2 + 2", arba "3 * 3" (aritmetiniai operatoriai + - * /)grazina teisingai suskaiciuota rezultata
		public static int calc(String eilute) {
			String a, c, b;
			a = eilute.substring(0, 1);
			b = eilute.substring(2, 3);
			c = eilute.substring(4, 5);
            if (b.equalsIgnoreCase("+")) return (Integer.parseInt(a) + Integer.parseInt(c));
            if (b.equalsIgnoreCase("-")) return (Integer.parseInt(a) - Integer.parseInt(c));
            if (b.equalsIgnoreCase("*")) return (Integer.parseInt(a) * Integer.parseInt(c));
            if (b.equalsIgnoreCase("/")) return (Integer.parseInt(a) / Integer.parseInt(c));
			return 0000000000000000000;
		}
//////Gauna tris skaicius.Grazina rezultata, kiek skaiciu yra pasikartojantys pvz. (5,4,5) -> 2
		public static int pasikartoja(int a, int b, int c) {
			int i = 0;
			if ((a == b) || (b == c) || (c == a)){
				i = 1;
			if (a == b) i++;
			if (a == c) i++;
			if (c == b) i++;
			if (i == 4) i = 3; 
			}
			return i;
		}
/////// 6 Su Varargs gauna skaicius (int... skaiciai) grazina daugiausiai pasikartojanciu skaiciu kieki
		public static int varargs(int...masyvas) {
			int pasikartojimu_skaicius = 0;
			int skaicius_kuris_pasikartoja = 0;
			int ilgis = masyvas.length - 1;
			for(int m1_koef = 0; m1_koef < ilgis; m1_koef++) {
				int individualus_pasikartojimu_koef = 0;
				for (int m2_koef = 0; m2_koef < ilgis; m2_koef++) {
					if (masyvas[m1_koef] == masyvas[m2_koef])
						individualus_pasikartojimu_koef++;
				}
				if (individualus_pasikartojimu_koef > pasikartojimu_skaicius) {
					pasikartojimu_skaicius = individualus_pasikartojimu_koef;
					skaicius_kuris_pasikartoja = masyvas[m1_koef];
				}
			}
			
			return skaicius_kuris_pasikartoja;
	
		}
		
}
