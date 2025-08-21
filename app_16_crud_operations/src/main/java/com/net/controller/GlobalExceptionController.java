package com.net.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {
	
	
	@ExceptionHandler(Exception.class)
	public String handlException(Exception ex)
	{
		return "WE HAHDLING THAT REQUEST TRY AFTER SOME TIME";
	}

}
