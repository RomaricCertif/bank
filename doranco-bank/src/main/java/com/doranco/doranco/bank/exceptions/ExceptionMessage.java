package com.doranco.doranco.bank.exceptions;

import java.util.Date;

public class ExceptionMessage {
	
	private Date date=new Date();
	
	private String className;
	
	private String message;
	
	
	public ExceptionMessage() {
		
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
