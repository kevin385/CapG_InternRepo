package com.cg.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends RuntimeException {
	List<String> messages = new ArrayList<String>();
	
	public ValidationException(List<String> msgs) {
		super();
		
		this.messages = msgs;
		System.out.println("Inside List params constructor");
		System.out.println("Messages " + messages);
	}
	
	public List<String> getMessages() {
		return messages;
	}
}
