
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biudzetas {
	Scanner sc = new Scanner(System.in);
	ArrayList<PajamuIrasas> pajamos = new ArrayList<>();
	ArrayList<IslaiduIrasas> islaidos = new ArrayList<>();

	public void start() {

		while (true) {

			spausdintiMenu();

			if (apdorotiPasirinkimas(getUserResponse())) {
				break;

			}
		}
		System.out.println("Aciu darba baigiau. Einu kavos.");
	}

	private boolean apdorotiPasirinkimas(int pasirinkimas) {
		int tipas = 0;
		switch (pasirinkimas) {
		case 1:
			System.out.println("1 - Rodyti pajamas");// +
			rodytiPajamas();
			return false;
		case 2:
			System.out.println("2 - Rodyti islaidas");// +
			rodytiIslaidas();
			return false;
		case 3:
			tipas = 1;
			System.out.println("3 - Prideti pajamu irasa");
			pridetiIrasa(tipas);
			return false;
		case 4:
			tipas = 2;
			System.out.println("4 - Prideti islaidu irasa");
			pridetiIrasa(tipas);
			return false;
		case 5:
			System.out.println("5 - Spaudinti balansa");
			rodytiBalansa();
			return false;
		case 6:
			System.out.println("6 - Trinti pajamas/islaidas");
			spausdintiMenu2();
			int pasirinkimas2 = getUserResponse();
			trintiIrasa(pasirinkimas2);
			return false;
		case 7:
			System.out.println("7 - Redaguoti pajamas/islaidas");
			spausdintiMenu3();
			int pasirinkimas3 = getUserResponse();
			redaguotiIrasa(pasirinkimas3);
			return false;
		case 0:
			System.out.println("0 - Baigti darba");
			return true;
		default:
			System.out.println("Nesupratau...");
			return false;
		}
	}

	private boolean trintiIrasa(int pasirinkimas2) {
		int tipas = 0;
		switch (pasirinkimas2) {
		case 1:
			tipas = 1;
			System.out.println("1 - Trinti pajamu irasa");
			rodytiPajamas();
			trintiIrasa(getUserResponse(), tipas);
			return true;
		case 2:
			tipas = 2;
			System.out.println("2 - Trinti islaidu irasa");
			rodytiIslaidas();
			trintiIrasa(getUserResponse(), tipas);
			return true;
		}
		return false;
	}

	private void trintiIrasa(int irasoNr, int tipas) {
		irasoNr--;
		if (tipas == 2) {
			IslaiduIrasas irasasKuriTrinam = null;
			for (IslaiduIrasas e : islaidos) {
				if (e.id == (irasoNr)) {
					irasasKuriTrinam = e;

				}
			}
			islaidos.remove(irasasKuriTrinam);
		}
		if (tipas == 1) {
			PajamuIrasas irasasKuriTrinam = null;
			for (PajamuIrasas e : pajamos) {
				if (e.id == (irasoNr)) {
					irasasKuriTrinam = e;
				}
			}
			pajamos.remove(irasasKuriTrinam);
		}
	}

	private boolean redaguotiIrasa(int pasirinkimas3) {
		int tipas = 0;
		switch (pasirinkimas3) {
		case 1:
			tipas = 1;
			System.out.println("1 - Redaguoti pajamu irasa");
			rodytiPajamas();
			redaguotiIrasa(getUserResponse(), tipas);
			return true;
		case 2:
			tipas = 2;
			System.out.println("2 - Redaguoti islaidu irasa");
			rodytiIslaidas();
			redaguotiIrasa(getUserResponse(), tipas);
			return true;
		}
		return false;
	}

	private void redaguotiIrasa(int irasoNr, int tipas) {
		irasoNr--;

		if (tipas == 2) {
			IslaiduIrasas irasasKuriPasirenkam = islaidos.get(irasoNr);
			System.out.println("(T/N) Ar norite redaguoti ar tai bankinis pavedimas: " + irasasKuriPasirenkam.arIBanka);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				irasasKuriPasirenkam.setArIBanka(!irasasKuriPasirenkam.isArIBanka());
				System.out.println("Jusu irasas ar bankinis pakeistas: " + irasasKuriPasirenkam.arIBanka);
			}
			System.out.println("T/N Ar norite redaguoti suma: " + irasasKuriPasirenkam.suma);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				System.out.println("Iveskite suma:");
				irasasKuriPasirenkam.setSuma(Integer.parseInt(sc.nextLine()));
				System.out.println("Jusu irasas suma pakeistas: " + irasasKuriPasirenkam.suma);
			}
			System.out.println("T/N Ar norite redaguoti papildoma info: " + irasasKuriPasirenkam.papildomaInfo);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				System.out.println("Iveskite komentara:");
				irasasKuriPasirenkam.setPapildomaInfo(sc.nextLine());
			}
			System.out.println("T/N Ar norite redaguoti tipa: " + irasasKuriPasirenkam.kategorija);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				System.out.println("Dabartine kategorija: " + irasasKuriPasirenkam.kategorija);
				irasasKuriPasirenkam.setKategorija(getKategorijaI());
				System.out.println("Nauja kategorija: " + irasasKuriPasirenkam.kategorija);
			}

		}
		if (tipas == 1) {
			PajamuIrasas irasasKuriPasirenkam = pajamos.get(irasoNr);
			System.out.println("(T/N) Ar norite redaguoti ar tai bankinis pavedimas: " + irasasKuriPasirenkam.arIBanka);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				irasasKuriPasirenkam.setArIBanka(!irasasKuriPasirenkam.isArIBanka());
				System.out.println("Jusu irasas ar bankinis pakeistas: " + irasasKuriPasirenkam.arIBanka);
			}
			System.out.println("T/N Ar norite redaguoti suma: " + irasasKuriPasirenkam.suma);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				System.out.println("Iveskite suma:");
				irasasKuriPasirenkam.setSuma(Integer.parseInt(sc.nextLine()));
				System.out.println("Jusu irasas suma pakeistas: " + irasasKuriPasirenkam.suma);
			}
			System.out.println("T/N Ar norite redaguoti papildoma info: " + irasasKuriPasirenkam.papildomaInfo);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				System.out.println("Iveskite komentara:");
				irasasKuriPasirenkam.setPapildomaInfo(sc.nextLine());
			}
			System.out.println("T/N Ar norite redaguoti tipa: " + irasasKuriPasirenkam.kategorija);
			if (sc.nextLine().equalsIgnoreCase("T")) {
				System.out.println("Dabartine kategorija: " + irasasKuriPasirenkam.kategorija);
				irasasKuriPasirenkam.setKategorija(getKategorijaP());
				System.out.println("Nauja kategorija: " + irasasKuriPasirenkam.kategorija);
			}

		}

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

		System.out.println("Jusu balansas:  \n" + " Paemos: " + pajamuSuma + " EUR\n Islaidos: " + islaiduSuma
				+ " EUR\n Likutis: " + (pajamuSuma - islaiduSuma) + " EUR");

	}
	
	private void pridetiIrasa2(int tipas) {
		LocalDateTime data = LocalDateTime.now();
		boolean inputIsFine = false;
		String arBankinis;
		while (!inputIsFine) {
			System.out.println("Ar bankiniu pavedimu? T/N");
			arBankinis = sc.nextLine();
			if (arBankinis.equalsIgnoreCase("T") || arBankinis.equalsIgnoreCase("N")) {
				inputIsFine = true;
			}
		}
	}

	private void pridetiIrasa(int tipas) {

		LocalDateTime data = LocalDateTime.now();
		while (true) {
			System.out.println("Ar bankiniu pavedimu? T/N");
			
//			try {
				String arBankinis = sc.nextLine();
				if (arBankinis.equalsIgnoreCase("T") || arBankinis.equalsIgnoreCase("N")) {

					boolean arIBanka = arBankinis.equals("T");
					System.out.println("Pakomentuokite irasa");
					String papildomaInfo = sc.nextLine();
					KategorijaP kategorija1 = null;
					KategorijaI kategorija2 = null;
					if (tipas == 1) {
						kategorija1 = getKategorijaP();
					}
					if (tipas == 2) {
						kategorija2 = getKategorijaI();
					}
					float suma;
					while (true) {
						System.out.println("Iveskite suma");
						  
						try {
							suma = sc.nextFloat();
							sc.nextLine();
						} catch (InputMismatchException nfe) {
							System.out.println("not a float, trying again");
							sc.nextLine();
							continue;
						}
						if (tipas == 1) {
							PajamuIrasas pi = new PajamuIrasas(data, arIBanka, papildomaInfo, suma, kategorija1);
							pajamos.add(pi);
						}
						if (tipas == 2) {
							IslaiduIrasas pi = new IslaiduIrasas(data, arIBanka, papildomaInfo, suma, kategorija2);//
							islaidos.add(pi);
						}

						System.out.println("Pridetas irasas \n ");
		
						break;
					}
					break;
				}
//			}
//			catch (Exception e) {
//			}
		}
	}
//Thread.sleep(ms);
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

//+
	private void rodytiIslaidas() {/////// ismanusis for
		System.out.println("Jusu islaidos yra: ");
		float islaiduSuma = 0;

		for (IslaiduIrasas e : islaidos) {
			System.out.println(e);
			islaiduSuma += e.suma;

		}
		System.out.println("Is viso: " + islaiduSuma);

	}

//+
	private void rodytiPajamas() { ////// paprastas for analogas
		System.out.println("Jusu paemos yra: ");
		float pajamuSuma = 0;
		for (int i = 0; i < pajamos.size(); i++) {
			System.out.println(pajamos.get(i));
			pajamuSuma += pajamos.get(i).suma;
		}
		System.out.println("Is viso: " + pajamuSuma);

	}

//+ pvz
	private int getUserResponse() {
		while (true) {
			System.out.println("Jusu pasirikimo numeris?");
			try {
				String reiks = sc.nextLine();
				int pasirinkimas = Integer.parseInt(reiks);
				if ((pasirinkimas >= 0) && (pasirinkimas < 8))
					return pasirinkimas;
			} catch (Exception e) {
			}
		}
	}

	private void spausdintiMenu() {

		System.out.println("1 - Rodyti pajamas");
		System.out.println("2 - Rodyti islaidas");
		System.out.println("3 - Prideti pajamu irasa");
		System.out.println("4 - Prideti islaidu irasa");
		System.out.println("5 - Spaudinti balansa");
		System.out.println("6 - Trinti pajamas/islaidas");
		System.out.println("7 - Redaguoti pajamas/islaidas");
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

//+
	private void spausdintiMenu2() {
		System.out.println("1 - Trinti pajamu irasa");
		System.out.println("2 - Trinti islaidu irasa");

	}

//+
	private void spausdintiMenu3() {
		System.out.println("1 - Redaguoti pajamu irasa");
		System.out.println("2 - Redaguoti islaidu irasa");

	}

//+
	public ArrayList<PajamuIrasas> gautiPajamuIrasus() {
		for (int i = 0; i < pajamos.size(); i++) {
			// System.out.println(pajamos.get(i).toString());

		}
		return pajamos;
	}

//+
	public ArrayList<IslaiduIrasas> gautiIslaiduIrasus() {

		for (int i = 0; i < islaidos.size(); i++) {
			// System.out.println(islaidos.get(i).toString());

		}
		return islaidos;
	}

}
