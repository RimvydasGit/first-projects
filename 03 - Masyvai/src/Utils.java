public class Utils {

/////	
//	Gauna sakini. Grazina sakini, su is kitos puses sudetais zodziais
//	pvz. "Lietuvoje gera gyventi" -> "gyventi gera Lietuvoje"
//	galima naudoti String.split() metoda
////
	public static boolean isEiles(int[] skaiciai) {
		int c = skaiciai.length;
			for (int ilgisup = 1; ilgisup < c; ilgisup++ ) {
					if (!(skaiciai[ilgisup] == ((skaiciai[ilgisup - 1] + 1 )))) return false;	
			}
			return true;					
	}
///
//Gauna skaiciu masyva. Grazina true, jei visi skaiciai eina is eiles.
//Pvz. [3,4,5,6,7,8] -> true
//[1,2,4,5] -> false
///
		public static int min(int[] skaiciai) {
	        int rezultatas = Integer.MAX_VALUE;
	        int rezultatas2 = (Integer.MAX_VALUE -1);
	        for( int index = 0 ; index < skaiciai.length ; index++) {
	            if( rezultatas > skaiciai[index] ) {
	                if (rezultatas2 > rezultatas) {
	                	rezultatas2 = rezultatas;
	                }
	            	rezultatas = skaiciai[index];  
	            }    
	        }
	        System.out.print(rezultatas + " ir " + rezultatas2);
	        return 0;     
	}
	///
	public static String forbackwardprint(String []vardai) {
		
		for (int x = 0; x > 10; x++) {
		String zodis = vardai[x];
		
		String b = "";
		for (int a = (zodis.length() - 1); a != -1; a--){
		char d = zodis.charAt(a);
		b = b + d;
		}
		System.out.print( b + " ");
		}
		return "";
	}
	///
	public static String masyvas2() {
		char[] masyvascf = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		char[] masyvasct = new char [7];
		System.arraycopy(masyvascf, 2, masyvasct, 0, 7);
		return  ("Senas zodis: " + new String(masyvascf) + " Naujas zodis: " + new String(masyvasct));		
	}
	///
	public static int masyvas1(int a) {
		int[] masyvas = new int[11];
		masyvas[0] = 0;
		masyvas[1] = 1;
		masyvas[2] = 2;
		masyvas[3] = 3;
		masyvas[4] = 4;
		masyvas[5] = 5;
		masyvas[6] = 6;
		masyvas[7] = 7;
		masyvas[8] = 8;
		masyvas[9] = 9;
		masyvas[10] = 10;
		return masyvas[a];
	}
	///
}
