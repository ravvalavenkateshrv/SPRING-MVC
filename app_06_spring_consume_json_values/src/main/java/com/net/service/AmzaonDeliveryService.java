package com.net.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.AmzaonDelivery;
import com.net.entity.Cart;
import com.net.repository.AmzaonDeliverRepository;

@Service
public class AmzaonDeliveryService {
	
	@Autowired
	private AmzaonDeliverRepository amzaonRepository;
	
	
	public String addAmazonDelivery(AmzaonDelivery amazonDelivery)
	{
		
		
		if(amzaonRepository.existsById(amazonDelivery.getEmail()))
		{
			return "CART ITEMS ALREADY EXISTED";
		}else
		{
			amzaonRepository.save(amazonDelivery);
			return "SUCCESSFULLY CART ITEMS INSERTED";
		}
	}

	}
	

