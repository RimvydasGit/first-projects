package lt.codeacademy.learn.ligonine;

import java.io.*;
import java.util.HashMap;
import lt.codeacademy.learn.ligonine.entities.Pacientas;
import lt.codeacademy.learn.ligonine.exceptions.BadDataException;

public class FileHelper {
	private final static String FILE_NAME = "txt/pacientai.txt";

	public static void save(HashMap<Integer, Pacientas> pacientai) {
		PrintWriter out = null;
		try {
			out = getFilePrinter();
			for (Pacientas p : pacientai.values())
				out.println(p.getDataForFile());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (out != null)
			out.close();

	}

	public static HashMap<Integer, Pacientas> load() {
		HashMap<Integer, Pacientas> result = new HashMap<>();
		BufferedReader br = null;
		try {
			br = getInputReader();
			String line = null;
			int lineCounter = 0;
			while ((line = br.readLine()) != null) {
				lineCounter++;
				try {
					Pacientas p = new Pacientas(line);
					result.put(p.getId(), p);
				} catch (BadDataException e) {
					System.out.println(e.getMessage());
					System.out.println("Skaitant faila ivyko klaida. Eilute " + lineCounter);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return result;
	}

	private static BufferedReader getInputReader() throws FileNotFoundException {
		File failas = new File(FILE_NAME);
		FileInputStream fis = new FileInputStream(failas);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		return br;
	}

	private static PrintWriter getFilePrinter() throws IOException {
		FileWriter fw = new FileWriter("txt/pacientai.txt", false);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		return out;
	}

}