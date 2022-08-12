package com.doranco.doranco.bank.exceptions;

public class DorancoException extends Exception{
	
	public DorancoException() {
	
	}
	
	public DorancoException(String message) {
		super(message);
	}
	
	public DorancoException(String message, Throwable cause) {
		super(message,cause);
	}


}
