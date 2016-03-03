package com.spring.rest.dao.medication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.model.patient.Patient;

@Repository
public interface PatientDao extends CrudRepository<Patient, Long> {
	
	Patient findById(long patientId);
	
}
