
public class Program {
	public static void main(String[] args) { 
		String pirmaEilute = "Vienas";
		String antraEilute = " Du";
		pirmaEilute += antraEilute;
		System.out.println("Pavyzdys string suma: " + pirmaEilute);
		String zodis1 = "mama";
		String zodis2 = zodis1.replace('m', 'p');
		System.out.println("Raidziu keitimas mama m=p : " + zodis2);
		int ilgis =  "Mano tekstas".length();
		System.out.println("\"Mano tekstas\" teksto ilgis: " + ilgis);
		char Treciaraide = "Mano tekstas".charAt(2);
		System.out.println("\"Mano tekstas\" trecia raide: " + Treciaraide);
		String vardas = "Mano vardas Rimvydas".substring(12);
		System.out.println("\"Mano vardas Rimvydas\" string apkarpymas nuo 13 simbolio: " + vardas);
		System.out.println("\"Mano vardas Rimvydas\" string apkarpymas nuo 6 iki 12 simbolio: " + "Mano vardas Rimvydas".substring(5,11));
		String myName = "Rimvydas";
		System.out.println("\"Rimvydas\" v raides pozicija skaiciuojant nuo 0 : " + myName.indexOf('v'));
		System.out.println("\"mama\" m raides pirma pozicija zodyje: " + zodis1.indexOf('m'));
		String zodis3 = "mama";
		String zodis4 = "MaMa";
		System.out.println("\"mama\" ar lygu \"papa\"= " + zodis1.equals(zodis2) + " " + "ir \"mama\" ar lygu \"mama\" = " + zodis1.equals(zodis3));
	    System.out.println(zodis1.equals(zodis4) + " " + zodis1.equalsIgnoreCase(zodis4));
        System.out.println(zodis1.compareTo(zodis3) + " " + zodis1.compareTo(zodis4) + " " + zodis1.compareToIgnoreCase(zodis4));
        String zodis5 = " Sveikas klase ! ";
        System.out.println('!' + zodis5 + '!');
        System.out.println('!' + zodis5.trim() + '!');
        String a = "Ne" , b = " ge " , c = "rai";
        System.out.println(a.concat(b).concat(c));
        System.out.println(a.concat(b.trim()).concat(c));
        String d = a.concat(b.trim()).concat(c);
        System.out.println(d + " " + d.toLowerCase() + " " + d.toUpperCase());
        String s = "" + 123;
        System.out.println("" + 123);
        System.out.println(s);
        
	
	}		
}
