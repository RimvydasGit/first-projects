
public class Utils {
	public static boolean arPorinis(int sk) {
		System.out.println("Metodas: arPorinis");
        return ((sk % 2 ) == 0) ;
    }
//	Parašyti metodą arPorinis, kuris grąžina true, 
//	jei skaičius porinis.

	public static boolean isMale(String zodis) {
		System.out.println("Metodas: isMale");
		char raide;
		raide = zodis.charAt(zodis.length() - 1 );
		return raide == 's' ;
	}
	//Parašyti //metodą isMale, kuris grąžina true, jei duotas
	//tekstas baigiasi s raide


	public static boolean hasSpace(String zodis) {
	System.out.println("Metodas: hasSpace");
	int a;
	a = zodis.indexOf(" ");
	return !((-1) == a);
		
	}

//Parašyti metodą hasSpace, 
//kuris grąžina true, jei duotame tekste yra tarpas.
public static boolean ilg20(String zodis) {
	int a;
	a = zodis.length();
	System.out.println("Metodas: ilg20");
	return a < 20;
	}

//Parašyti metodą, kuris grąžina true, 
//jei duotas tekstas yra trumpesnis, nei 20 simbolių.
public static boolean raide(String zodis) {
	System.out.println("Metodas: raide");
	zodis = zodis.toUpperCase();
	int a;
	a = (zodis.length() - 1);
	return zodis.charAt(0) == zodis.charAt(a);
	}

//pirma ir paskutine raide yra ta pati
//didziosios mazosios neturi reiksmes
public static boolean raide2(String zodis) {
	System.out.println("Metodas: raide2");
	zodis = zodis.toUpperCase();
	int a;
	a = (zodis.length() - 2);
	return zodis.charAt(1) == zodis.charAt(a);
	}
//parasyti metoda kuris grazina ar antra
//ir priespaskutine raide yra tokios pacios
//didziosios mazosios neturi reiksmes
public static boolean keliamieji(int metai) {
	if (!(metai % 4 != 0))
	 return false;
		else if ((metai % 100 != 0))
			return true;
			else if (!(metai % 400 != 0))
			return false;
				else return true;
	
}
///
///
	public static String meta(int sk) {
		if ((sk > 2) && (sk < 6))
		return "Pavasaris ";
		else if ((sk > 5) && (sk < 9))
			return "Vasara ";
			else if ((sk > 8) && (sk < 12))
				return "Ruduo ";
				else if ((sk == 1) ^ (sk == 2) ^ (sk == 12))
					return "Ziema ";
					else return "";
	}				
//
///
	public static String metMen(int sk) {
		switch(sk) {
		case 1: return Utils.meta(sk) + "Sausis.";
		case 2: return Utils.meta(sk) + "Vasaris.";
        case 3: return Utils.meta(sk) + "Kovas.";
        case 4: return Utils.meta(sk) + "Balanadis.";
		case 5: return Utils.meta(sk) + "Geguze.";
		case 6: return Utils.meta(sk) + "Birzelis.";
		case 7: return Utils.meta(sk) + "Liepa.";
		case 8: return Utils.meta(sk) + "Rugpjutis.";
		case 9: return Utils.meta(sk) + "Rugsejis.";
		case 10: return Utils.meta(sk) + "Spalis.";
		case 11: return Utils.meta(sk) + "Lapkritis.";
		case 12: return Utils.meta(sk) + "Gruodis.";
		
		default: return "Tokio menesio nera.";
		}
	}
}

