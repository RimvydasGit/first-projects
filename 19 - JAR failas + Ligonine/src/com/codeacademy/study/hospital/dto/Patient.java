package com.codeacademy.study.hospital.dto;

import com.codeacademy.study.hospital.exceptions.WrongDataException;

public class Patient {

	
	private int patientId;
	private String patientName;
	private String patientRecord;
	
	public Patient(int patientId, String patientName, String patientRecord) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientRecord = patientRecord;
		
	}
	
	@Override
	public String toString() {
		return patientId + ": " + patientName + ", " + patientRecord;
	}

	public Patient(String line) throws WrongDataException {
		String[] args = line.split(";");
		if (args.length != 3) {
			throw new WrongDataException ("Can't create patient according: " + line);
		}
		this.patientId = Integer.parseInt(args[0]);
		this.patientName = args[1];
		this.patientRecord = args[2];
 	}
	public int getPatientId() {
		return  patientId;
	}
	public String getDataForFile() {
		return patientId + ";" + patientName + ";" + patientRecord;
	}

	public String getPatientsName() {
		return patientName;
	}
	public String getPatientsRecord(){
		return patientRecord;
	}

	public void setPatientsName(String patientName2) {
		this.patientName = patientName2;
		
	}
	public void setPatientsRecord(String patientRecord2) {
		this.patientRecord = patientRecord2;
		
	}
}
