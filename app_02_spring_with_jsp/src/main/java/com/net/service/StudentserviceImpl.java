package com.net.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.Student;
import com.net.repo.StudentRepository;
@Service
public class StudentserviceImpl implements StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String createStudent(Student student) {
		
		studentRepository.save(student);
		
		
		return "Successfully created" ;
	}

	@Override
	public boolean isStudentExisted(int id) {
		
		return studentRepository.existsById(id);
	}

	@Override
	public List<Student> getAllStudents() {
	
		return studentRepository.findAll();
	}

}
