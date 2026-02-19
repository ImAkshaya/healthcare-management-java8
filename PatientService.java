package com.akshaya.healthcare.service;

import com.akshaya.healthcare.model.Patient;
import com.akshaya.healthcare.util.CsvUtil;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients() {
        return CsvUtil.readPatients();
    }

    public Patient getPatientById(Long id) {
        for (Patient p : CsvUtil.readPatients()) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        throw new RuntimeException("Patient not found");
    }

    public void addPatient(Patient patient) {
        CsvUtil.addPatient(patient);
    }
}
