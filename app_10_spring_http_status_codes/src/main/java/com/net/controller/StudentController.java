package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Student;
import com.net.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/create/user")
	public ResponseEntity<String> userSignUp(@RequestBody Student student)
	{
		String result= studentService.createTheStudent(student);
		 ResponseEntity<String> responseEntity=null;
		 
		 if(result.equals("USER CREATED SUCCESSFULLY"))
		 {
			 responseEntity=new ResponseEntity<>(result,HttpStatus.valueOf(404));
		 }else
		 {
			 responseEntity=new ResponseEntity<>(result,HttpStatus.valueOf(200));
			 
		 }
		 return responseEntity;
		
		
	}
	
	
	@GetMapping("get/student/{id}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable int id)
	{
		
		ResponseEntity entity=null;
		
		Student student= studentService.getTheStudentDetails(id);
		if(student!=null)
		{
			return new ResponseEntity<>(student,HttpStatus.valueOf(200));
		}else
		{
			return new ResponseEntity<>(null,HttpStatus.valueOf(204));
		}
	}

}
