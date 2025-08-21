package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.dto.ProductInformation;
import com.net.service.FakeStoreService;

import lombok.Data;

@RestController
public class FakeStoreController {
	
	
	@Autowired
	private FakeStoreService fakeStoreService;
	
	
	@GetMapping("/find/product/{id}")
	public ProductInformation findtheProduct(@PathVariable int id)
	{
		return fakeStoreService.findDetailsOfproduct(id);
	}
	
	@GetMapping("/limit/products")
	public List<ProductInformation> theseProductsNeed(@RequestParam int numberOfProducts)
	{
		return fakeStoreService.findtheLimitProducts(numberOfProducts);
	}
	
	@GetMapping("valid/token")
	public String validatingThetoken(@RequestHeader("Authorization") String Authorization)
	{
		return fakeStoreService.validatingTheTokenService();
	}

}
