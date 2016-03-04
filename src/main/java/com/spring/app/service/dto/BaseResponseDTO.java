package com.spring.app.service.dto;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseResponseDTO {
	private boolean success;
	private List<String> messages;
		
	public BaseResponseDTO() {
		this.success = true;
		this.messages = new ArrayList<String>();
	}
	
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	 * @return the messages
	 */
	public List<String> getMessages() {
		return messages;
	}
	/**
	 * @param messages the messages to set
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}
