package com.net.exception;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex)
	{
		
		List<FieldError> errors= ex.getFieldErrors();
		
		
	List<String> validationErrors=	errors.stream().map(e->e.getField()+" :"+e.getDefaultMessage()).toList();
	
		
		
		
		
		return ResponseEntity.badRequest().body(validationErrors);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobal(Exception ex)
	{
		
		return ResponseEntity.badRequest().body("WE ARE FACING SOME ISSUME WAIT FOR SOME TIME");
		
	}

}
