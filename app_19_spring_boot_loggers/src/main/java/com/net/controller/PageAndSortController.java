package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Student;
import com.net.service.StudentService;

@RestController
public class PageAndSortController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/sort/students")
	public List<Student> sortingStudent()
	{
		
		
		return studentService.sortingTheStudent();
		
	}

	
	
	@GetMapping("/find")
	public Student findByIdAndPassword(@RequestParam int id,@RequestParam String password)
	{
		return studentService.findTheidandPassword(id, password);
		
	}
	
	@GetMapping("/page/students")
	public List<Student> pagingStudent()
	{
		
		
		return studentService.pagingTheStudents();
		
	}
	
	

}
