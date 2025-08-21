package com.net.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {
	
	
	@ExceptionHandler(Exception.class)
	public String handlException(Exception ex)
	{
		return "WE HAHDLING THAT REQUEST TRY AFTER SOME TIME";
	}

}
