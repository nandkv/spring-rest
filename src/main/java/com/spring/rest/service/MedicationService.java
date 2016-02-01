package com.spring.rest.service;

import org.springframework.stereotype.Component;

import com.spring.rest.domain.Medication;

@Component
public class MedicationService {

	public Medication getMedicationByPatientId(final String patientId){
		//call the service
		//map from xml to domain
		//return new mapped domain object
		return new Medication("Zopax", "Take 1 tablet by mouth daily");
	}
}
