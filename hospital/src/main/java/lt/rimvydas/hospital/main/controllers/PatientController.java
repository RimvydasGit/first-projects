package lt.rimvydas.hospital.main.controllers;

import lt.rimvydas.hospital.main.entities.Patient;
import lt.rimvydas.hospital.main.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @GetMapping("/patient/reg")
    public String showPatientRegForm(Patient patient){
        return "add-patient";
    }
    @PostMapping("add-patient")
    public String addPatient(Patient patient, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/patient/reg";
        }
       patientService.save(patient);
        return "redirect:/patient";
    }
    @GetMapping("/patient")
    public String showPatientList(Model model) {
        model.addAttribute("patients", patientService.findAll());
        return "patient";
    }
    @GetMapping("/edit/{patientId}")
    public String showPatientEditForm(@PathVariable("patientId") long patientId, Model model) {
        Patient patient = patientService.findById(patientId);
        model.addAttribute("patient", patient);
        return "/patient/update/{patientId}";
    }
    @PostMapping("/patient/update/{patientId}")
    public String updatePatient(@PathVariable("patientId") long patientId, Patient patient, BindingResult result, Model model) {
        if (result.hasErrors()) {
            patient.setPatientId(patientId);
            return "/patient";
        }
       patientService.save(patient);
        return "redirect:/patient";
    }
    @GetMapping("/patient/delete/{patientId}")
    public String deletePatient(@PathVariable("patientId") long patientId, Model model) {
        Patient patient = patientService.findById(patientId);
        patientService.delete(patient);
        return "redirect:/patient";
    }

}


