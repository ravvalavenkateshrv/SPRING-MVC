package com.net.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/add/student")
	public String addStudent()
	{
		return "STUDENT IS CREATED";
	}

}
