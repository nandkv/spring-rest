package com.spring.rest.model.patient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "medication", uniqueConstraints = {@UniqueConstraint(columnNames = "name") })
public class Medication {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "instructions")
	private String instructions;
	
//	@ManyToOne
//	private Patient patient;
//	
	//required by JPA
	protected Medication() {}
	
	public Medication(@NotNull String name, @NotNull String instructions) {
		//this.patient = patient;
	    this.name = name;
	    this.instructions = instructions;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the instructions
	 */
	public String getInstructions() {
		return instructions;
	}

	/**
	 * @return the patient
	 */
//	public Patient getPatient() {
//		return patient;
//	}


	
}
