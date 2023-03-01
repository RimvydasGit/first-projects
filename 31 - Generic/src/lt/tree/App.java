package lt.tree;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Medis> ivairusMedziai = Arrays.asList(
				new Azuolas(),
				new Berzas(),
				new Egle(),
				new Pusis(),
				new Berzas());
	ivairusMiskas(ivairusMedziai);			
	}

	 static <T extends Medis>void ivairusMiskas(List<T> list) {
		System.out.println("Ivairus miskas:");
		for (Medis medis : list) {
			medis.turi();
		}
	}

	void spygliuociuMiskas(List<? extends Spygliuotis> list) {
		System.out.println("Spygliuociu miskas:");
		for (Spygliuotis medis : list) {
			medis.turi();
		}

	}

	void berzuMiskas(List<? extends Berzas> list) {
		System.out.println("Berzu miskas:");
		for (Berzas medis : list) {
			medis.turi();
		}
	}
}
