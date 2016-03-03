package com.spring.rest.service.medication;

import com.spring.rest.dto.patient.PatientResponseDTO;

public interface MedicationService {

	public PatientResponseDTO findMedicationByPatientId(final String patientId) ;
	
}
