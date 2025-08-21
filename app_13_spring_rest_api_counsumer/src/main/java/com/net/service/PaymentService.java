package com.net.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.net.entity.dto.Student;

@Service
public class PaymentService {

	public List<String> theTypesOfPayments() {
		
		
		String url="http://localhost:7000/payment/payment/types";
		RestTemplate restTemplate=new RestTemplate();
		
		ResponseEntity<List> responseEntity=restTemplate.getForEntity(url, List.class);
		
		
		return responseEntity.getBody();
	}
	
	public List<Map<String,Object>> getAllProducts()
	{
		String url="https://fakestoreapi.com/products";
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<List> responseEntity=restTemplate.getForEntity(url, List.class);
		
		System.out.println(responseEntity.getBody());
		
		return responseEntity.getBody();
	
	}

	public Student addStudent(Student student) {
		
		String url="http://localhost:7000/payment/add/student";
		
        
        HttpEntity<Student> httpEntityStudent=new HttpEntity<>(student);
		RestTemplate restTemplate=new RestTemplate();
	
	   ResponseEntity<Student> responseEntity=	restTemplate.exchange(url, HttpMethod.POST,  httpEntityStudent, Student.class);
	
		
		
		return responseEntity.getBody();
	}
	

}
