package com.doranco.doranco.bank.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionMessage> genericExceptionHandler
    (HttpServletRequest request, Exception exception) {
        ExceptionMessage message = new ExceptionMessage();
        message.setClassName(exception.getClass().getName());
        message .setMessage(exception.getMessage());
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	

	@ExceptionHandler(DorancoException.class)
    public ResponseEntity<ExceptionMessage> nolidoExceptionHandler
    (HttpServletRequest request, DorancoException exception) {
        ExceptionMessage message = new ExceptionMessage();
        message.setClassName(exception.getClass().getName());
        message .setMessage(exception.getMessage());
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }


}
