package Uzduotis1;

import java.io.*;


public class Failas {
		static  void writer(String kaIrasom, String failoVardas) throws IOException { //Tekstiniu failu rasymas Java
		    
			//Sukuriamas objektas turintis rysi su failu        
			FileWriter fw = new FileWriter("txt/"+failoVardas+".txt", true);  
		   
			//sukuriamas objektas, kuris naudoja buferi   
			BufferedWriter bw = new  BufferedWriter(fw);  
		   
			//sukuriamas pats printeris, kuris moka rasyti po viena eilute       
			PrintWriter out = new PrintWriter(bw);  
		    // taip turime galimybe prideti viena eilute i faila        
			//jei reikia daug eiluciu, reikia apgaubti su ciklu       
			
			out.println(kaIrasom);
		    
			//baigus rasyma, reikia uzdaryti       
			out.close();
		    }
		static String reader() throws IOException { //Tekstiniu Failu skaitymas eilutemis Java
	        
			//Prikabiname faila prie objekto        
			File failas = new File("txt/vardas.txt");
	        
			//Atsidarome srauta skaitymui        
			FileInputStream fis = new FileInputStream(failas);
	        // Sukuriamas tarpinis buferis        
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	        //eilute i kuria gausim string is failo        
			
			String line = null;
	        //ciklas veikia, kol nuskaityta eilute nera null        
			String a ="";
			while ((line = br.readLine()) != null) {
	         //atliekame veiksmus su eilute            
			a = a + line;
	        }
			br.close();
			return a;
	        //uzdarome buferi       
			
	    }
		static String reverse(String input) {
			  String b = "";
			 char[] try1 = input.toCharArray();
			  
		        for (int i = try1.length - 1; i >= 0; i--)
		           b = b + try1[i];
		return b;
		}
		
}
