package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Student;
import com.net.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/add/student")
	public String addStudentDetails(@RequestBody Student student)
	{
		
		return studentService.addStudentDetails(student);
	}

}
