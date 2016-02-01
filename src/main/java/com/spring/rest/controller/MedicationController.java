package com.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.domain.Medication;
import com.spring.rest.service.MedicationService;

@RestController
public class MedicationController {
    private MedicationService medicationService;

    @Autowired
    public MedicationController(MedicationService medicationService) {
        this.medicationService = medicationService;
    }
    

    @RequestMapping("/medications")
    public Medication getMedications(@RequestParam(name="patientId", defaultValue="15233" ) String patientId) {    	
        return medicationService.getMedicationByPatientId(patientId);
    }
    
}