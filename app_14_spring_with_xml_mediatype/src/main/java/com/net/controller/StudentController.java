package com.net.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Student;

@RestController
public class StudentController {
	
	@PostMapping(path="create/student",consumes=MediaType.APPLICATION_XML_VALUE,produces=MediaType.APPLICATION_XML_VALUE)
	public Student createStudent(@RequestBody Student student)
	{
		System.out.println("Successfully created");
		
		return student;
		
	}

}
