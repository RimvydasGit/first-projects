package Uzduotis2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Vairuotojas {
	String vardas = "";
	String automobilis = "";
	String valstNr = "";
	int rida = 0;
	public Vairuotojas(String vardas, String automobilis, String valstNr, int rida) {
		super();
		this.vardas = vardas;
		this.automobilis = automobilis;
		this.valstNr = valstNr;
		this.rida = rida;
	}
	static void writer(ArrayList<Vairuotojas> vairuotojai, String failoVardas) throws IOException { //Tekstiniu failu rasymas Java
	    
		//Sukuriamas objektas turintis rysi su failu        
		FileWriter fw = new FileWriter("txt/"+failoVardas+".CSV", true);  
	   
		//sukuriamas objektas, kuris naudoja buferi   
		BufferedWriter bw = new  BufferedWriter(fw);  
	   
		//sukuriamas pats printeris, kuris moka rasyti po viena eilute       
		PrintWriter out = new PrintWriter(bw);  
	    // taip turime galimybe prideti viena eilute i faila        
		//jei reikia daug eiluciu, reikia apgaubti su ciklu       
		
		out.println(vairuotojai);
	    
		//baigus rasyma, reikia uzdaryti       
		out.close();
	    }
}
