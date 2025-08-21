package com.net.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.Product;
import com.net.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public String addProduct(Product product) {
	
		Optional<Product> optProduct=productRepository.findById(product.getId());
		if(optProduct.isEmpty())
		{
			productRepository.save(product);
			return "PRODUCT CREATED SUCCESSFULLY";
		}else
		{
			return  "PRODUCT ALREADY EXISTED";
		}
		
	}

	public List<Product> addMoreProduct(List<Product> products) {
	
		return productRepository.saveAll(products);
		
		

			
	}

	public List<Product> findProductsCategory(String category) {
		
		return productRepository.findByCategory(category);
	}

	public List<Product> findTheProductBrandandCategory(String brand, String category) {
		
		return productRepository.findByBrandAndCategory(brand, category);
	}
	
	public List<Product> findTheproductBrand(String brand)
	{
		return productRepository.findByBrand(brand);
	}

}
