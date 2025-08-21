package com.net.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.net.entity.Student;
import com.net.repository.StudenRepository;

@Service
public class StudentService {
	
	
	Logger logger=LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	private StudenRepository  studentRepository;

	public String addStudent(Student student) {
		
		Optional<Student> studentObject=studentRepository.findById(student.getId());
		
		logger.info("the loger came add student object INFO");
		logger.debug("the loger came add student object debug");
		logger.warn("the loger came add student object warn");
		logger.trace("the loger came add student object trace");
		logger.error("the loger came add student object error");
		
		if(studentObject.isEmpty())
		{
			System.out.println("STUDENT CREATED SUCCESSFULLY");
			String result="Successfully created";
			studentRepository.save(student);
			logger.info(result);
		  //  logger.info("The Student is created "+studentObject.get());
		    return  "STUDENT CREATED SUCCESSFULLY";
		}else
		{
			logger.info("STUDENT CREATED FAILURE");
			 return  "STUDENT CREATED FAILURE";
		}
	}
	
	public List<Student> addAllStudent(List<Student> students) {
		
		return studentRepository.saveAll(students);
	}

	
	
	public Student findTheStudents(int id) {
	
		Student optStudent=studentRepository.findById(id).get();
		
		return optStudent;
	}

	public boolean studentExistedOrNotDB(int id) {
		
		return studentRepository.existsById(id);
	}



	public List<Student> sortingTheStudent() {
		
		 
		return studentRepository.findAll(Sort.by(Direction.ASC, "id"));
	}

	public List<Student> pagingTheStudents() {
		
		Page<Student> page=studentRepository.findAll(PageRequest.of(0, 3));
	
		return page.getContent();
	}
	
	
	public Student findTheidandPassword(int id, String password)
	{
		
		return studentRepository.findByIdAndPassword(id, password);
	}


}
