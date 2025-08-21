package com.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.Student;
import com.net.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public String addStudentDetails(Student student)
	{
		studentRepository.save(student);
		return "SUCCESSFULLY CREATED";
	}

}
