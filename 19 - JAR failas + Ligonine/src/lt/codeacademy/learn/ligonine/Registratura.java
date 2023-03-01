package lt.codeacademy.learn.ligonine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import lt.codeacademy.learn.ligonine.entities.Gydytojas;
import lt.codeacademy.learn.ligonine.entities.Pacientas;
import lt.codeacademy.learn.ligonine.entities.Vizitas;

public class Registratura {
	HashMap<Integer, Pacientas> pacientai = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	ArrayList<Gydytojas> gydytojai = new ArrayList<>();

	public void run() {
		pacientai = FileHelper.load();
		spausdintiSarasa();
		seedGydytojaiWithDummyData();// uzkrovimas gydytoju
		while (true) {

			if (mainMenu()) {// jeigu grizta true, darba baigiame
				break;
			}
		}
		FileHelper.save(pacientai);
		System.out.println("Program baigia darba");
	}

	boolean mainMenu() {
		rodytiMenu();
		int pasirinkimas = getNumberFromConsole("Pasirinkite menu punkta");
		switch (pasirinkimas) {
		case 1:
			ivestiNaujaPacienta();
			return false;
		case 2:
			spausdintiSarasa();
			return false;

		case 0:
			return true;
		case 3:
			redaguoti();
			return false;

		case 4:
			deletePacientas();
			return false;

		case 5:
			registruotiVizitui();
			return false;
		case 6:
			perziuretiVizitus();
			return false;

		default:
			System.out.println("Nesupratau");
			return false;
		}
	}

	private void perziuretiVizitus() {
		Gydytojas gydytojas = getGydytojas();
		if (gydytojas == null)
			return;
		System.out.println(gydytojas);
		for (Vizitas vizitas : gydytojas.getVizitai()) {
			System.out.println(vizitas.toString());
		}
	}

	private void rodytiMenu() {
		System.out.println("---------------------------");
		System.out.println("0 - Baigti darba");
		System.out.println("1 - Ivesti nauja pacienta");
		System.out.println("2 - Rodyti pacientu sarasa");
		System.out.println("3 - Redaguoti pacientu sarasa");
		System.out.println("4 - Istrinti pacienta");
		System.out.println("5 - Registruoti vizitui");
		System.out.println("6 - Perziureti vizitus");
		System.out.println("---------------------------");
	}

	private void ivestiNaujaPacienta() {
		System.out.println("Naujo paciento ivedimas");
		String name = getRealTextFromConsole("Iveskite paciento varda ir pavarde", 3);
		String istorija = getRealTextFromConsole("Iveskite ligos istorija", 0);
		Pacientas p = createPacientas(name, istorija);
		pacientai.put(p.getId(), p);
	}


	private void spausdintiSarasa() {// CRUD - CREATE - READ - UPDATE - DELETE
		for (Pacientas p : pacientai.values()) {
			System.out.println(p);
		}

	}

	private void redaguoti() {

		Pacientas p = getPacientas();
		if (p == null)
			return;

		String name = getRealTextFromConsole(p.getName(), 0);
		if (!name.isBlank())
			p.setName(name);

		String ligosIstorija = getRealTextFromConsole(p.getLigosIstorija(), 0);
		if (!name.isBlank())
			p.setName(name);
		// parodyti varda ir pavarde. Leisti ivesti nauja
		// Parodyti ligos istorija. Leisti ivesti nauja.
	}

	private void deletePacientas() {
		Pacientas p = getPacientas();
		if (p == null)
			return;
		pacientai.remove(p.getId());
	}

	private void registruotiVizitui() {
		Pacientas p = getPacientas();
		if (p == null)
			return;

		// pasirinkti gydytoja
		Gydytojas gydytojas = getGydytojas();
		if (gydytojas == null)
			return;
		// sukurti vizita
		LocalDateTime pradzia = getVizitoLaikas("Iveskite vizito pradzios laika:");
		LocalDateTime pabaiga = getVizitoLaikas("Iveskite vizito pabaigos laika:");
		// vizita priskirti gydytojui

		Vizitas vizitas = new Vizitas(p, pradzia, pabaiga);
		gydytojas.paskirtiVizita(vizitas);

	}

	private Pacientas getPacientas() {
		spausdintiSarasa();
		int id = getNumberFromConsole("Pasirinkite pacienta");
		if (!pacientai.containsKey(id)) {
			System.out.println("Tokio paciento neradome");
			return null;
		}
		return pacientai.get(id);
	}

	private Pacientas createPacientas(String name, String ligosIstorija) {
		return new Pacientas(getNextId(), name, ligosIstorija);
	}

	private int getNumberFromConsole(String string) {
		while (true) {
			try {
				System.out.println(string);
				String text = sc.nextLine();
				int rezultatas = Integer.parseInt(text);
				return rezultatas;
			} catch (Exception e) {
			}
		}
	}

	private String getRealTextFromConsole(String pranesimas, int minLenght) {
		while (true) {
			System.out.println(pranesimas);
			String text = sc.nextLine();
			if (text.length() >= minLenght) {
				return text;
			}
		}
	}

	private int getNextId() {
		int max = Integer.MIN_VALUE;

		for (int i : pacientai.keySet())
			if (i > max)
				max = i;
		return max + 1;
	}

	private void seedGydytojaiWithDummyData() {
		gydytojai.add(new Gydytojas("Doc. Aiskauda", "245"));
		gydytojai.add(new Gydytojas("Prof. Dolitlis", "123"));

	}

	private void spausdintiGydytojuSarasa() {

		for (int i = 0; i < gydytojai.size(); i++) {
			System.out.println(i + ": " + gydytojai.get(i));
		}

	}

	private Gydytojas getGydytojas() {
		spausdintiGydytojuSarasa();
		int index = getNumberFromConsole("Pasirinkite gydytoja");
		if ((index < 0) || (index >= gydytojai.size()))
			return null;
		return gydytojai.get(index);
	}

	private LocalDateTime getVizitoLaikas(String pranesimas) {
		while (true) {
			try {
				String formatString = "yyyy-MM-dd HH:mm:ss";
				pranesimas += "\n" + formatString;
				String eilute = getRealTextFromConsole(pranesimas, 5);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatString);
				LocalDateTime dateTime = LocalDateTime.parse(eilute, formatter);
				return dateTime;
			} catch (Exception e) {
				System.out.println("Blogai ivedete laika. Pabandykite is naujo");
			}
		}
	}
}
