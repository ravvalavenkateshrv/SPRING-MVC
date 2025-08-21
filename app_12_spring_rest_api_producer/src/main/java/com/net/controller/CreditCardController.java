package com.net.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.CreditCardPayment;
import com.net.service.CreditCardService;

@RestController
public class CreditCardController {
	
	
	@Autowired
	private CreditCardService creditCardService;
	
	@PostMapping("/debitcart")
	public CreditCardPayment getCreditCardPayment(@RequestBody CreditCardPayment creditCardpayment)
	{
		return creditCardService.paymentViaCreditCart(creditCardpayment);
	}
	
	@GetMapping("/payment/types")
	public List<String> typesOfPayments()
	{
		return List.of("1, credit cart, 2 Debit Cart");
	}
	
	
	@GetMapping("/generate/token")
	public String generateToken(@RequestHeader ("Authorization") String Authorization)
	{
		
		
		String token= UUID.randomUUID().toString();
		System.out.println("validating the token from poducer application"+token);
		
		return token;
	}

}
