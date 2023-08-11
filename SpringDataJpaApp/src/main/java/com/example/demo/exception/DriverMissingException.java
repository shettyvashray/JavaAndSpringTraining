package com.example.demo.exception;

public class DriverMissingException extends Exception {
	private String message;

	public DriverMissingException() {
		super();
	}

	public DriverMissingException(String message) {
		super(message);
		this.message = message;
}
	
}
