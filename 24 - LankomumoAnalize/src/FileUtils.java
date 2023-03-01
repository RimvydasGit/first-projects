import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import java.io.UnsupportedEncodingException;

import java.util.ArrayList;

public class FileUtils {

	private static File[] getFileNames() {
		File directory = new File("csv");
		return directory.listFiles();
	}

	public static ArrayList<String> getDataRowsfromFiles() {
		ArrayList<String> rows = new ArrayList<>();
		File[] fileList = getFileNames();
		for (int i = 0; i < fileList.length; i++) {
			try {
				rows.addAll(load(fileList[i]));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	private static ArrayList<String> load(File file) throws FileNotFoundException, UnsupportedEncodingException {
		ArrayList<String> result = new ArrayList<>();
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		try {
			String line = null;
			int lineCount = 0;
			while ((line = br.readLine()) != null) {
				lineCount++;
				if (lineCount > 8)
					result.add(line);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}
