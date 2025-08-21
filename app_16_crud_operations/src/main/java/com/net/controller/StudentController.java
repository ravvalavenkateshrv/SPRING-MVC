package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Student;
import com.net.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/create/student")
	public String createStudent(@Valid @RequestBody Student student)
	{
		
	
		
				return studentService.addStudent(student);
	
	}
	@PostMapping("save/all")
	public List<Student> createAllStudent(@RequestBody List<Student> students)
	{
		
	
		return studentService.addAllStudent(students);
	}
	
	@GetMapping("/find/student/{id}")
	public Student findTheStudent(@PathVariable int id)
	{
		return studentService.findTheStudents(id);
	}
	@GetMapping("student/exist/{id}")
	public boolean studentExistedOrNot(@PathVariable int id)
	{
		
		return studentService.studentExistedOrNotDB(id);
	}

}
