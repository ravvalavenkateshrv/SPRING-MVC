package com.net.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.AmazonDeliveryInformation;
import com.net.repository.AmazonDeliveryInformationRepository;

@Service
public class AmazonDeliveryInformationService {
	
	
	@Autowired
	private AmazonDeliveryInformationRepository deliveryRepository;

	public String createDeliveryInformation(AmazonDeliveryInformation deliveryInformation)
	{
		
		deliveryRepository.save(deliveryInformation);
		
		return "SUCCESSFULLY CREATED";
	}

	public List<AmazonDeliveryInformation> getAlltheDeliveryInformation() {
		
		return deliveryRepository.findAll();
	}
}
