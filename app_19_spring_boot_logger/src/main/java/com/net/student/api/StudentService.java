package com.net.student.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
    @Autowired
	private StudentRepository studentRepositoy;

	public Student addStudent(Student student) {
	
		
		Optional<Student> optStudent=studentRepositoy.findById(student.getId());
		
		if(!optStudent.isPresent())
		{
			return studentRepositoy.save(student);
			
			
		}else
		{
			return null;
		}
	}

}
