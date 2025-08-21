package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.AmazonDeliveryInformation;
import com.net.service.AmazonDeliveryInformationService;

@RestController
public class AmazonDeliveryInformationControlller {
	
	@Autowired
	private AmazonDeliveryInformationService deliveryService;
	
	@PostMapping("/create/delivery")
	public String creteDeliver(@RequestBody AmazonDeliveryInformation deliveryInformation)
	{
	
		return deliveryService.createDeliveryInformation(deliveryInformation);
	}
	
	@GetMapping("/all/details")
	public List<AmazonDeliveryInformation> getTheDeliveryInformation()
	{
		System.out.println(deliveryService.getAlltheDeliveryInformation());
		return deliveryService.getAlltheDeliveryInformation();
	}

}
