package com.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.Cart;
import com.net.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	public String addCartItems(Cart cart)
	{
		
		
		if(cartRepository.existsById(cart.getId()))
		{
			return "CART ITEMS ALREADY EXISTED";
		}else
		{
			cartRepository.save(cart);
			return "SUCCESSFULLY CART ITEMS INSERTED";
		}
	}
}
