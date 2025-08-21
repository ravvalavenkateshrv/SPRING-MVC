package com.net.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.net.entity.Student;
import com.net.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public String createTheStudent(Student student)
	{
		Optional<Student> optStudent=studentRepository.findById(student.getId());
		if(!(optStudent.isPresent()))
		{
			studentRepository.save(student);
			return "USER CREATED SUCCESSFULLY";
		}else
		{
			return "USER ALREADY EXISTED";
		}
			
		
	}

	public Student getTheStudentDetails(int id) {
		
	       Optional<Student> optStudent= studentRepository.findById(id);
	       if(optStudent.isPresent())
	       {
	    	   return optStudent.get();
	    	   
	       }
	       else
	       {
	    	   return null;
	       }
	    	   
	
	}

}
