package com.spring.rest.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.patient.PatientResponseDTO;
import com.spring.rest.service.medication.MedicationService;

@RestController
public class MedicationController {
	//http://blogs.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/ 
    private MedicationService epicMedicationServiceImpl;

    @Inject
    public MedicationController(MedicationService epicMedicationServiceImpl) {
        this.epicMedicationServiceImpl = epicMedicationServiceImpl;
    }
    
    @RequestMapping("/")
    public String welcome() {    	
        return "Hello World";
    }
    
    @RequestMapping("/support")
    public String support() {    	
        return "Hello Support";
    }
    
    @RequestMapping("/api/medications")
    public PatientResponseDTO getMedications(@RequestParam(name="patientId", defaultValue="15233" ) String patientId)  {    	
        return epicMedicationServiceImpl.findMedicationByPatientId(patientId);
    }
    
}