package lt.rimvydas.hospital.main.controllers;

import lt.rimvydas.hospital.main.entities.Patient;
import lt.rimvydas.hospital.main.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    PatientService patientService;

    @GetMapping("/patient")
    public Iterable<Patient> showPatientList() {
        return patientService.findAll();

    }
}
