package lt.rimvydas.hospital.main.services;

import lt.rimvydas.hospital.main.PatientRespitory.PatientRepository;
import lt.rimvydas.hospital.main.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;
    public void save(Patient patient) {
        patientRepository.save(patient);
    }

    public  Iterable<Patient> findAll() {
        return patientRepository.findAll();
    }

    public  Patient findById(long patientId) {
        return patientRepository.findById(patientId).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + patientId));
    }

    public void delete(Patient patient) {
        patientRepository.delete(patient);
    }
//    }
}
