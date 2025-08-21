package com.net.student.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/add/student")
	public Student createStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}

}
