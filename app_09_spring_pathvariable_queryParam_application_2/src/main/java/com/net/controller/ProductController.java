package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.Product;
import com.net.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/add/product")
	public String addTheProduct(@RequestBody Product product)
	{
		
		return productService.addProduct(product);
	}
	@PostMapping("/add/more/product")
	public List<Product> addTheMoreProducts(@RequestBody List<Product> products)
	{
		
		return productService.addMoreProduct(products);
	}
	
	@GetMapping("/find/products/{category}")
	public List<Product> findTheProductsCategerory(@PathVariable String category)
	{
		
		return productService.findProductsCategory(category);
	}
	
	@PostMapping("/find")
	public List<Product> findProductBrandCategory(@RequestParam(required=false) String brand, @RequestParam(required=false) String category)
	{
		
		if(brand!=null && category!=null)
		{
			return productService.findTheProductBrandandCategory(brand, category);
		}
		else if(brand!=null && category==null)
		{
			return productService.findTheproductBrand(brand);
		}
		else
		{
			return productService.findProductsCategory(category);
		}
		
		
	}

}
