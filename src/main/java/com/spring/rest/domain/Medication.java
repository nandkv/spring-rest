package com.spring.rest.domain;

public class Medication {
	private String name;
	private String instructions;
	
	public Medication(String name, String instructions) {
		super();
		this.name = name;
		this.instructions = instructions;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(String instructions) {
		this.instructions = instructions;
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
	
	
}
