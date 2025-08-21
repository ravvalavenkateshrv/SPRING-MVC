package com.net.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.net.entity.Student;

@Service
public class StudentService {

	
  Logger logger=	LoggerFactory.getLogger(StudentService.class);
	
	
	public String createTheStudent(Student student) {
		
		
		String url="http://localhost:8080/create/student";
		RestTemplate restTemplate=new RestTemplate();
		
		
		 ResponseEntity<String> responseEntity =
			        restTemplate.postForEntity(url, student, String.class);
		return responseEntity.getBody();
	}

	public Student findTheStudent(int id) {
		
		
		logger.info("the loger came to find the studen tmethod"+ id);
	
		
		String url="http://localhost:8080/find/student/{id}";
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Student> student= restTemplate.exchange(url, HttpMethod.GET, null, Student.class, id);
		logger.info("the loger came to find the studen tmethod"+ student.getBody());
		return student.getBody();
		
	}

	public Student findTheidandPassword(int id, String password) {
	
		
		Map<String, Object> params=new HashMap<>();
		params.put("id", id);
		params.put("password", password);
		
		String url = "http://localhost:8080/find?id={id}&password={password}";
		RestTemplate restTemplate=new RestTemplate();
		
		return restTemplate.exchange(url, HttpMethod.GET, null, Student.class, params).getBody();
		
	
	}
	
}
