
package com.akshaya.healthcare.controller;

import com.akshaya.healthcare.model.Patient;
import com.akshaya.healthcare.service.PatientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return service.getPatientById(id);
    }

    @PostMapping
    public String addPatient(@RequestBody Patient patient) {
        service.addPatient(patient);
        return "Patient added successfully";
    }
}
