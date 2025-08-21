package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Cart;
import com.net.service.CartService;

@RestController
public class CartController {
	
	
	@Autowired
	private CartService cartService;
	
	
	@PostMapping("/add/cart")
	public String addCartDetails(@RequestBody Cart cart)
	{
		
		System.out.println(cart);
		
		return cartService.addCartItems(cart);
	}

}
