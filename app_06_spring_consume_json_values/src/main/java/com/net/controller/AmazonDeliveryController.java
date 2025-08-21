package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.AmzaonDelivery;
import com.net.repository.AmzaonDeliverRepository;
import com.net.service.AmzaonDeliveryService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AmazonDeliveryController {
	
	
	@Autowired
	private AmzaonDeliveryService amazaonService;
	
	
	
	@PostMapping("/amazon/order")
	public String creteTheOrder(@RequestBody AmzaonDelivery amazonDelivery)
	{
		
		amazaonService.addAmazonDelivery(amazonDelivery);
		return "successfully created";
		
	}

}
