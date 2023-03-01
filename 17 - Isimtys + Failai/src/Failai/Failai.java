package Failai;

import java.io.*;


public class Failai {
	static void writer() throws IOException { //Tekstiniu failu rasymas Java
	    
		//Sukuriamas objektas turintis rysi su failu        
		FileWriter fw = new FileWriter("src/failas.txt", true);  
	   
		//sukuriamas objektas, kuris naudoja buferi   
		BufferedWriter bw = new  BufferedWriter(fw);  
	   
		//sukuriamas pats printeris, kuris moka rasyti po viena eilute       
		PrintWriter out = new PrintWriter(bw);  
	    // taip turime galimybe prideti viena eilute i faila        
		//jei reikia daug eiluciu, reikia apgaubti su ciklu       
		
		out.println("the text");
	    
		//baigus rasyma, reikia uzdaryti       
		out.close();
	    }
	
	static void reader() throws IOException { //Tekstiniu Failu skaitymas eilutemis Java
        
		//Prikabiname faila prie objekto        
		File failas = new File("src/failas.txt");
        
		//Atsidarome srauta skaitymui        
		FileInputStream fis = new FileInputStream(failas);
        // Sukuriamas tarpinis buferis        
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        //eilute i kuria gausim string is failo        
		
		String line = null;
        //ciklas veikia, kol nuskaityta eilute nera null        
		
		while ((line = br.readLine()) != null) {
         //atliekame veiksmus su eilute            
		System.out.println(line);
        }
        //uzdarome buferi       
		br.close();
    }
}
