package com.spring.rest.service.medication.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.dao.medication.PatientDao;
import com.spring.rest.dto.patient.PatientResponseDTO;
import com.spring.rest.dto.patient.mapper.PatientDTOMapper;
import com.spring.rest.model.patient.Patient;
import com.spring.rest.service.medication.MedicationService;

@Service
public class EpicMedicationServiceImpl implements MedicationService {
	private PatientDao patientDao;
	
	@Inject
	public EpicMedicationServiceImpl(PatientDao patientDao) {
		this.patientDao = patientDao;
	}


	@Override
	@Transactional(readOnly=true)
	public PatientResponseDTO findMedicationByPatientId(String patientId) {
		Patient patient = patientDao.findById(Long.valueOf(patientId));
		return PatientDTOMapper.INSTANCE.patientToPatientResponseDto(patient);
	}

}
