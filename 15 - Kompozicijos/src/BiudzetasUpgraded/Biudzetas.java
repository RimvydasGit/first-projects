package BiudzetasUpgraded;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Biudzetas {
	Scanner sc = new Scanner(System.in);
	ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
	ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();

	public void start() {

		while (true) {

			spausdintiMenu();
			String pasirinkimas = getUserResponse();
			if (apdorotiPasirinkimas(pasirinkimas)) {
				break;

			}
		}
		System.out.println("Aciu darba baigiau. Einu kavos.");
	}

	private boolean apdorotiPasirinkimas(String pasirinkimas) {

		switch (pasirinkimas) {
		case "1":
			System.out.println("1 - Rodyti pajamas");
			rodytiPajamas();
			return false;
		case "2":
			System.out.println("2 - Rodyti islaidas");
			rodytiIslaidas();
			return false;
		case "3":
			System.out.println("3 - Prideti pajamu irasa");
			pridetiPajamas();
			return false;
		case "4":
			System.out.println("4 - Prideti islaidu irasa");
			pridetiIslaidas();
			return false;
		case "5":
			System.out.println("5 - Spaudinti balansa");
			rodytiBalansa();
			return false;
		case "6": 
			System.out.println("6 - Trinti pajamas/islaidas");
			spausdintiMenu2();
			String pasirinkimas2 = getUserResponse();
			trintiIrasa(pasirinkimas2);
			return false;
		case "0":
			System.out.println("0 - Baigti darba");
			return true;

		}
		if (!pasirinkimas.equals("0")){
		System.out.println("Nesupratau...");}
		return false;
	}

	private  boolean trintiIrasa(String pasirinkimas2) {
		switch (pasirinkimas2) {
		case "1":
			System.out.println("1 - Trinti pajamu irasa");
			rodytiPajamas();
			trintiPajamas(Integer.parseInt(getUserResponse()));
			return true;
		case "2":
			System.out.println("2 - Trinti islaidu irasa");
			rodytiIslaidas();
			trintiIslaidas(Integer.parseInt(getUserResponse()));
			return true;
		}
		return false;
	}

	private void trintiIslaidas(int irasoNr) {
		irasoNr--;
		IslaiduIrasas irasasKuriTrinam = null ;
		for (IslaiduIrasas e : islaidos) {
			if (e.id == (irasoNr )) {
				irasasKuriTrinam = e;
						
			}
		}	
		islaidos.remove(irasasKuriTrinam);
	}

	private void trintiPajamas(int irasoNr) {
		irasoNr--;
		PajamuIrasas irasasKuriTrinam = null ;
		for (PajamuIrasas e : pajamos) {
			if (e.id == (irasoNr )) {
				irasasKuriTrinam = e;
			}
		}	
	pajamos.remove(irasasKuriTrinam);
	}

	private void rodytiBalansa() {
		float islaiduSuma = 0;
		
		for (IslaiduIrasas e : islaidos) {
			islaiduSuma += e.suma;
			
		}
		float pajamuSuma = 0;
		for (int i = 0; i < pajamos.size(); i++) {
			pajamuSuma += pajamos.get(i).suma;
		}
		
	System.out.println("Jusu balansas:  \n" + " Paemos: " + pajamuSuma + " EUR\n Islaidos: " + islaiduSuma +  " EUR\n Likutis: " + (pajamuSuma - islaiduSuma) + " EUR");
		
	}

	private void pridetiIslaidas() {
		LocalDateTime data = LocalDateTime.now();
		System.out.println("Ar bankiniu pavedimu? T/N");
		String arBankinis = sc.nextLine();
		boolean arIBanka = arBankinis.equals("T");
		System.out.println("Pakomentuokite irasa");
		String papildomaInfo = sc.nextLine();
		KategorijaI kategorija = getKategorijaI();
		System.out.println("Iveskite suma");
		float suma = sc.nextFloat();
		sc.nextLine();
		IslaiduIrasas pi = new IslaiduIrasas(data, arIBanka, papildomaInfo, suma, kategorija);
		islaidos.add(pi);
		System.out.println("Pridetas irasas \n ");

	}

	private void pridetiPajamas() {
		LocalDateTime data = LocalDateTime.now();
		System.out.println("Ar bankiniu pavedimu? T/N");
		String arBankinis = sc.nextLine();
		boolean arIBanka = arBankinis.equals("T");
		System.out.println("Pakomentuokite irasa");
		String papildomaInfo = sc.nextLine();
		KategorijaP kategorija = getKategorijaP();
		System.out.println("Iveskite suma");
		float suma = sc.nextFloat();
		sc.nextLine();
		PajamuIrasas pi = new PajamuIrasas(data, arIBanka, papildomaInfo, suma, kategorija);
		pajamos.add(pi);
		System.out.println("Pridetas irasas \n ");
	}

	private KategorijaI getKategorijaI() {
		System.out.println("Pasirinkite kategorija");
		for (var kat : KategorijaI.values()) {
			System.out.println(kat.number + " - " + kat);
		}
		int pasirinkta = sc.nextInt();
		sc.nextLine();
		if (pasirinkta > 0 && pasirinkta < 5)
			return KategorijaI.values()[pasirinkta];

		return KategorijaI.KITA;
	}

	private void rodytiIslaidas() {///////ismanusis for
		System.out.println("Jusu islaidos yra: ");
		float islaiduSuma = 0;
	
		for (IslaiduIrasas e : islaidos) {
			System.out.println(e);
			islaiduSuma += e.suma;
			
		}
		System.out.println("Is viso: " + islaiduSuma);
		
	}

	private void rodytiPajamas() { //////paprastas for analogas
		System.out.println("Jusu paemos yra: ");
		float pajamuSuma = 0;
		for (int i = 0; i < pajamos.size(); i++) {
			System.out.println(pajamos.get(i));
			pajamuSuma += pajamos.get(i).suma;
		}
		System.out.println("Is viso: " + pajamuSuma);
		
	}

	private String getUserResponse() {
		System.out.println("Jusu pasirikimo numeris?");
		return sc.nextLine();
	}

	private void spausdintiMenu() {

		System.out.println("1 - Rodyti pajamas");
		System.out.println("2 - Rodyti islaidas");
		System.out.println("3 - Prideti pajamu irasa");
		System.out.println("4 - Prideti islaidu irasa");
		System.out.println("5 - Spaudinti balansa");
		System.out.println("6 - Trinti pajamas/islaidas");
		System.out.println("0 - Baigti darba");

	}
	private KategorijaP getKategorijaP() {
		System.out.println("Pasirinkite kategorija");
		for (var kat : KategorijaP.values()) {
			System.out.println(kat.number + " - " + kat);
		}
		int pasirinkta = sc.nextInt();
		sc.nextLine();
		if (pasirinkta > 0 && pasirinkta < 5)
			return KategorijaP.values()[pasirinkta];

		return KategorijaP.KITA;
	}
	private void spausdintiMenu2() {
		System.out.println("1 - Trinti pajamu irasa");
		System.out.println("2 - Trinti islaidu irasa");
		
	}

}
