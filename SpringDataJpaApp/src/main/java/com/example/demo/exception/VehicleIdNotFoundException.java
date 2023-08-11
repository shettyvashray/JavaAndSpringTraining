package com.example.demo.exception;

public class VehicleIdNotFoundException extends Exception {
	private String message;

	public VehicleIdNotFoundException() {
		super();
	}

	public VehicleIdNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
}
