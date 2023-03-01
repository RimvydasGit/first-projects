import java.util.HashMap;
import java.util.Map.Entry;

public class Utils {

	public static void spausdinkMap(HashMap <Integer, String > zmones ) {
		for (Entry<Integer, String> index : zmones.entrySet()){
			System.out.println("Raktas: " + index.getKey() + ", Reiksme: " + index.getValue());
		}
	}
	public static void spausdinkMap2(HashMap <String, Integer > zmones ) {
		for (Entry<String, Integer> index : zmones.entrySet()){
			System.out.println("Raktas: " + index.getKey() + ", Reiksme: " + index.getValue());
		}
	}
	public static boolean isNumeric(String number ){
	    try{
	        Integer.parseInt(number);
	    }catch(Exception e ){
	        return false;
	    }
	    return true;
	}
}
