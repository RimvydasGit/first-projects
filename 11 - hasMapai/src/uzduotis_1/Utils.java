package uzduotis_1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Utils {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Studentas> studentai = new HashMap<>();

	public void start() {

		while (true) {
			spausdintiPasirinkimus();
			int pasirinkimas = gautiPasirinkima();
			if (apdoroti(pasirinkimas)) {
				break;
			}
		}
		System.out.println("Aciu. Darba baigiau");
	}

	private boolean apdoroti(int pasirinkimas) {
		switch (pasirinkimas) {
		case 0: // baigti darba
			return true;
		case 1:
			pridetiStudenta();
			return false;
		case 2:
			System.out.println("Iveskite studento numeri:");
			spausdintiSarasa(gautiPasirinkima2());
			return false;
		case 3: 
			System.out.println("Iveskite studento numeri, kuri norite istrinti:");
			trintiStudenta(gautiPasirinkima2());
			return false;
		}
		return true;
	}

	private void pridetiStudenta() {
		Studentas stud = sukurtiStudenta();
		studentai.put(stud.getNumeris(), stud);
	}

	private Studentas sukurtiStudenta() {
		System.out.println("Iveskite studento varda:");
		String vardas = sc.nextLine();
		System.out.println("Iveskite studento pavarde:");
		String pavarde = sc.nextLine();

		while (true) {
			System.out.println("Iveskite studento nr:");
			String text = sc.nextLine();
			if (Utils.ArSkaicius(text)) {
				int numeris = Integer.parseInt(text);
				String universitetas = gautiUniversiteta();
				return new Studentas(vardas, pavarde, numeris, universitetas);
			}
			System.out.println("Ivestas blogas studento numeris - neatitinka kaiciaus.");
		}
	}

	private void spausdintiPasirinkimus() {
		System.out.println("[1]. Ivesti studenta");
		System.out.println("[2]. Gauti studenta pagal numeri");
		System.out.println("[3]. Trinti studenta pagal numeri");
		System.out.println("[0]. Baigti darba");
	}

	private int gautiPasirinkima() {
		while (true) {
			String text = sc.nextLine();
			if (ArSkaicius(text)) {
				return Integer.parseInt(text);
			}
			System.out.println("Ivesti blogi duomenys.");
			
		}
	}

	private static boolean ArSkaicius(String number) {
		try {
			Integer.parseInt(number);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private String gautiUniversiteta() {
		System.out.println("Iveskite studento universiteta:");
		return sc.nextLine();
	}

	private void spausdintiSarasa(int numeris) {
		for (Entry<Integer, Studentas> index : studentai.entrySet()){
			if (index.getKey() == numeris) {
			System.out.println("Studento numeris: " + index.getKey() + ", " + index.getValue());
			return;}
			
		}
	System.out.println("Studentas numeriu: " + numeris + ", neegzistuoja");
	}
	private int gautiPasirinkima2() {
		while (true) {
			String text = sc.nextLine();
			if (ArSkaicius(text)) {
				return Integer.parseInt(text);
			}
			System.out.println("Jus ivedete ne skaiciu.");
			
		}
	}
	private void trintiStudenta(int numeris) {
		for (Entry<Integer, Studentas> index : studentai.entrySet()){
			
			if (index.getKey() == numeris) {
			studentai.remove(numeris);
			System.out.println("Studentas numeriu: " + numeris + ", istrintas");
			return ;
			}
			
			
		}
		System.out.println("Studentas numeriu: " + numeris + ", neegzistuoja");
	}

}
