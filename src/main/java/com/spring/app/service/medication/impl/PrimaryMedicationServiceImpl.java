package com.spring.app.service.medication.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.app.persistence.dao.medication.PatientDao;
import com.spring.app.persistence.model.patient.Patient;
import com.spring.app.service.dto.patient.PatientResponseDTO;
import com.spring.app.service.dto.patient.mapper.PatientDTOMapper;
import com.spring.app.service.medication.MedicationService;

@Service
public class PrimaryMedicationServiceImpl implements MedicationService {
	private PatientDao patientDao;
	
	@Inject
	public PrimaryMedicationServiceImpl(PatientDao patientDao) {
		this.patientDao = patientDao;
	}


	@Override
	@Transactional(readOnly=true)
	public PatientResponseDTO findMedicationByPatientId(String patientId) {
		Patient patient = patientDao.findOneById(Long.valueOf(patientId));
		return PatientDTOMapper.INSTANCE.patientToPatientResponseDto(patient);
	}

}
