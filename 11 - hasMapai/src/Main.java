import java.util.HashMa;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> zmones = new HashMap<>();
		zmones.put(1, "Jonas");
		zmones.put(2, "Juozas");
		zmones.put(3, "Ona");
		zmones.put(69, "Alice");
		zmones.put(5, "Rob");
		zmones.put(6, "John");
		zmones.put(7, "Bob");
	
//		System.out.println(zmones);
//		System.out.println(zmones.get(69));
//		System.out.println(zmones.keySet());
		HashMap<String, Integer> zmonesatv = new HashMap<>();
		for (Entry<Integer, String> index : zmones.entrySet()) {
			zmonesatv.put(index.getValue(), index.getKey());
		}
			Utils.spausdinkMap2(zmonesatv);
		
//		Utils.spausdinkMap(zmones);
//		zmones.remove(69);
//		Utils.spausdinkMap(zmones);
//		zmones.clear();
//		Utils.spausdinkMap(zmones);
//		for (Entry<Integer, String> index : zmones.entrySet()){
//			System.out.println("Raktas: " + index.getKey() + ", Reiksme: " + index.getValue());
//		}
			
			//System.out.println(Utils.ilgzodis(sarasas));
			//System.out.println(Utils.removesame(sarasas));
			//Projecto structura naudojant switch
			// sukurti programa su vartotojo meniu
			//* 1. prideti nauja asm
			//* 2. spausdinsime asm sarasa
			//* 3. istrinti asmeni
			//* 0 baigti darba
			//* 
			//1 act spausdinti menu
			//2 act gauti vartotojo pasirinkima
			//3 act apdoroti pasirinkima
			Registratura reg = new Registratura();
			reg.start();
	}

}
