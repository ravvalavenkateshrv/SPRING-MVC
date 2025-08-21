package com.net.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.student.Student;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	
	
	@PostMapping("/add/student")
	public Student createStudent( @Valid @RequestBody Student student)
	{
		return student;
	}
	
	
	
	@PostMapping("/check/student")
	public String  generatedStudent() throws ClassNotFoundException 
	{
		Class.forName("venkat");
		
		return "CREATED SUCCESSFULLY";
		
		
	}

}
