package lt.codeacademy.learn.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;




public class FileHelper {
	private final static String FILE_NAME ="txt/hangman.txt";

	private static BufferedReader getInputReader() throws FileNotFoundException {
		File file = new File(FILE_NAME);
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		return br;
	}
	public  ArrayList<String> load() {
		ArrayList<String> result = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = getInputReader();
			String line = null;
			while ((line = br.readLine()) != null) {
					result.add(line);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return result;
	}

}
