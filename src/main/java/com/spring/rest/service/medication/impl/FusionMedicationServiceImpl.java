package com.spring.rest.service.medication.impl;

import org.springframework.stereotype.Service;

import com.spring.rest.dto.patient.PatientResponseDTO;
import com.spring.rest.service.medication.MedicationService;

@Service
public class FusionMedicationServiceImpl implements MedicationService {

	@Override
	public PatientResponseDTO findMedicationByPatientId(String patientId) {
		//call the service
		//map from xml to domain
		//return new mapped domain object
		return new PatientResponseDTO();
	}

}
