package com.spring.rest.dto.patient;

import java.util.Set;

import com.spring.rest.domain.patient.Medication;
import com.spring.rest.domain.patient.Patient;
import com.spring.rest.dto.BaseResponseDTO;

public class PatientResponseDTO extends BaseResponseDTO {
	private Patient patient;
	private Set<Medication> medications;
	
	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the medications
	 */
	public Set<Medication> getMedications() {
		return medications;
	}

	/**
	 * @param medications the medications to set
	 */
	public void setMedications(Set<Medication> medications) {
		this.medications = medications;
	}

	
	public void setName(String name){
		if (this.getPatient() == null){
			this.patient = new Patient();
		}
		this.patient.setName(name);
	}

	public void setUserid(String userid){
		if (this.getPatient() == null){
			this.patient = new Patient();
		}
		this.patient.setUserid(userid);
	}

}
