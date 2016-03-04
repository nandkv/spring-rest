package com.spring.app.web.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.service.dto.patient.PatientResponseDTO;
import com.spring.app.service.medication.MedicationService;

@RestController
public class MedicationController {
	//http://blogs.sourceallies.com/2011/08/spring-injection-with-resource-and-autowired/ 
    private MedicationService primaryMedicationServiceImpl;

    @Inject
    public MedicationController(MedicationService primaryMedicationServiceImpl) {
        this.primaryMedicationServiceImpl = primaryMedicationServiceImpl;
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
    public PatientResponseDTO getMedications(@RequestParam(name="patientId", defaultValue="1" ) String patientId)  {    	
        return primaryMedicationServiceImpl.findMedicationByPatientId(patientId);
    }
    
}