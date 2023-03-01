package com.codeacademy.study.hospital;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import com.codeacademy.study.hospital.dto.Patient;

public class Reception {
	HashMap<Integer, Patient> patients = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void run() {
		patients = File_Helper.load();

		printPatientList();
		// seedWithDummyData(patients);

		while (true) {
			if (mainMenu()) {
				break;
			}
		}
		File_Helper.save(patients);
		System.out.println("|||Program closed|||");
	}

	private void printPatientList() {
		for (Patient p : patients.values()) {
			System.out.println(p);
		}

	}
// CRUD - create, read, update and delete
//	private void seedWithDummyData(HashMap<Integer, Patient> map) {
//		map.put(1, new Patient(1, "Alice Wonder", "throuth acke"));
//		map.put(2, new Patient(2, "Bob Sponge", "head issues"));
//		map.put(3, new Patient(3, "Mikky Mouse", "broken tail"));
//		map.put(4, new Patient(4, "Buderbrode James", "operation"));
//	}

	boolean mainMenu() {
		showMenu();
		int choise = getNumberFromConsole("Choose menu option");
		switch (choise) {
		case 0:
			return true;
		case 1:
			addNewPatient();
			return false;
		case 2:
			printPatientList();
			return false;
		case 3:
			editPatient();
			return false;
		case 4:
			deletePatient();
			return false;
		default:
			System.out.println("Did not uderstood, try again");
			return false;
		}
	}

	private void deletePatient() {
		Patient p =  getPatient();
		if (p == null) return;
		patients.remove(p.getPatientId());
	
}

	private void editPatient() {
	 
		Patient p =  getPatient();
		if (p == null) return;
		String patientName = getRealTextFromConsole(p.getPatientsName(), 0);
		if (!patientName.isBlank())
			p.setPatientsName(patientName);
		String patientRecord = getRealTextFromConsole(p.getPatientsRecord(), 0);
		if (!patientRecord.isBlank())
			p.setPatientsRecord(patientRecord);

	}

	private Patient getPatient() {
		printPatientList();
		int patientId = getNumberFromConsole("Chose patient");

		if (!patients.containsKey(patientId)) {
			System.out.println("Patient according id: " + patientId + ", do not exist");
			return null;
		}
		return patients.get(patientId);
	}

	private void showMenu() {
		System.out.println("-----------------------------");
		System.out.println("0 - Quit menu");
		System.out.println("1 - Add new patient");
		System.out.println("2 - Show patient list");
		System.out.println("3 - Edit patient from list");
		System.out.println("4 - Delete patient from list");
		System.out.println("-----------------------------");
	}

	private void addNewPatient() {
		System.out.println("Add new patient:");
		String patientName = getRealTextFromConsole("Patient name and surename:", 3);
		String patientRecord = getRealTextFromConsole("Patient record:", 0);
		Patient p = createPatient(patientName, patientRecord);
		patients.put(p.getPatientId(), p);

	}

	private Patient createPatient(String patientName, String patientRecord) {
		return new Patient(getNextId(), patientName, patientRecord);
	}

	private String getRealTextFromConsole(String statement, int minLenght) {
		while (true) {
			System.out.println(statement);
			String text = sc.nextLine();
			if (text.length() >= minLenght)
				return text;
			else
				System.out.println("Text is too short");
		}
	}

	private int getNumberFromConsole(String statement) {
		while (true) {
			try {
				System.out.println(statement);
				String text = sc.nextLine();
				int result = Integer.parseInt(text);
				return result;
			} catch (Exception e) {
			}
		}
	}

	private int getNextId() {
		int max = 0;

		for (int i : patients.keySet())
			if (i > max)
				max = i;

		return max + 1;
	}
}
