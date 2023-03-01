package Uzduotis2;

import java.io.IOException;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
	
	Vairuotojas driv0 = new	Vairuotojas("Petras Petraitis","Volvo","HBH 220", 2000000);
	Vairuotojas driv1 = new	Vairuotojas("Jonas Petraitis","Mazda","TBH 420", 24000000);
	Vairuotojas driv2 = new	Vairuotojas("Kestas Petraitis","Audi","LBH 920", 2066600);
	Vairuotojas driv3 = new	Vairuotojas("Arturas Petraitis","Fiat","SBH 600", 40000000);
	ArrayList<Vairuotojas> vairuotojai = new ArrayList<>();
	try {
		Vairuotojas.writer(vairuotojai, "vairuotojai");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
