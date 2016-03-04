package com.spring.app.service.medication;

import com.spring.app.service.dto.patient.PatientResponseDTO;

public interface MedicationService {

	public PatientResponseDTO findMedicationByPatientId(final String patientId) ;
	
}
