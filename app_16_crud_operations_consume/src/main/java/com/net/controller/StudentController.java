package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Student;
import com.net.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("create/student")
	public String createStudent(@RequestBody Student student)
	{
		
		return studentService.createTheStudent(student);
	}
	
	@GetMapping("/find/student/{id}")
	public Student findStudent(@PathVariable int id)
	{
		
		return studentService.findTheStudent(id);
	}
	

	@GetMapping("/find")
	public Student findByIdAndPassword(@RequestParam int id,@RequestParam String password)
	{
		return studentService.findTheidandPassword(id, password);
		
	}
	
	

}
