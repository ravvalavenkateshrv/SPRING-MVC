package com.net.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.net.entity.Student;

@Service
public interface StudentService {

	public String createStudent(Student student);
	
	public boolean isStudentExisted(int id);
	public List<Student> getAllStudents();
}
