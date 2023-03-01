package com.codeacademy.study.hospital;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

import com.codeacademy.study.hospital.dto.Patient;

import com.codeacademy.study.hospital.exceptions.WrongDataException;


public class File_Helper {
	private final static String FILE_NAME ="txt/patients.txt";
	public static void save(HashMap<Integer, Patient> patients) {
		PrintWriter out = null;
		try {
			out = getFilePrinter();
			for (Patient p : patients.values())
				out.println(p.getDataForFile());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (out != null) 
		out.close();
	}

	private static PrintWriter getFilePrinter() throws IOException {
		FileWriter fw = new FileWriter(FILE_NAME, false);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		return out;
	}

	public static HashMap<Integer, Patient> load() {
		HashMap<Integer, Patient> result = new HashMap<>();
		BufferedReader br = null;
		try {
			br = getInputReader();
			String line = null;
			int lineCounter = 0;
			while ((line = br.readLine()) != null) {
				lineCounter++;
				try {
					Patient p = new Patient(line);
					result.put(p.getPatientId(), p);
				} catch (WrongDataException e) {
					System.out.println(e.getMessage());
					System.out.println("File reading error. Row: " + lineCounter);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return result;
	}

	private static BufferedReader getInputReader() throws FileNotFoundException {
		File file = new File(FILE_NAME);
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		return br;
	}

		
		
}
