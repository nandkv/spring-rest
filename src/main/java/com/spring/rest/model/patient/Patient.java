package com.spring.rest.model.patient;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "patient", uniqueConstraints = {@UniqueConstraint(columnNames = "userid")})
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "userid", unique = true, nullable = false)
	private String userid;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "name", unique = false, nullable = false)
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, orphanRemoval=true)
	@JoinColumn(name="patientId") 
	private Set<Medication> medications = new HashSet<Medication>();
	
	//required by JPA
	protected Patient() {}

	public Patient(@NotNull String userid, @NotNull String password, @NotNull String patientId, @NotNull String name) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the medications
	 */
	public Set<Medication> getMedications() {
		return medications;
	}

	

}
