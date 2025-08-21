package com.net.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	
	
	@Value("${email}")
	private String contactEmail;
	
	
	@GetMapping("/student/email")
	public String findTheEmail()
	{
		return "The application emil is    "+contactEmail;
	}

}
