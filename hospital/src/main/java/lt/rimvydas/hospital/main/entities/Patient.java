package lt.rimvydas.hospital.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long patientId;
    private String patientName;
    private String patientRecord;

    public Patient(long patientId, String patientName, String patientRecord) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientRecord = patientRecord;
    }
    public Patient( String patientName, String patientRecord) {
            this.patientName = patientName;
            this.patientRecord = patientRecord;

    }
    public Patient() {
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientRecord() {
        return patientRecord;
    }

    public void setPatientRecord(String patientRecord) {
        this.patientRecord = patientRecord;
    }
}
