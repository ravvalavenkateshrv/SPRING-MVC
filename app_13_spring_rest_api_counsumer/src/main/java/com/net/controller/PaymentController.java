package com.net.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.dto.Student;
import com.net.service.PaymentService;

@RestController
public class PaymentController {
	
	
	@Autowired
	private PaymentService paymentService;
	
	
	@GetMapping("payment/types")
	public List<String> typesOfPayments()
	{
		System.out.println("what is error");
		return paymentService.theTypesOfPayments();
	}

	@GetMapping("/products")
	public List<Map<String,Object>> allProducts()
	{
		return paymentService.getAllProducts();
	}
	
	@PostMapping("/add/student")
	public Student creteStudent(@RequestBody Student student)
	{
		return paymentService.addStudent(student);
	}
}
