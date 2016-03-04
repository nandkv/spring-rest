package com.spring.app.persistence.dao.medication;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.app.persistence.model.patient.Patient;

@Repository
public interface PatientDao extends CrudRepository<Patient, Long> {
	
	Sort BY_ID = new Sort("id");
	
	Patient findOneById(long patientId); 
	
}
