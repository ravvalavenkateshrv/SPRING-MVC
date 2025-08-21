package com.net.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.net.entity.dto.ProductInformation;


@Service
public class FakeStoreService {

	public ProductInformation findDetailsOfproduct(int id) {
	
		
		String url="https://fakestoreapi.com/products/{1}";
		
		RestTemplate restTemplate=new RestTemplate();
		
		ProductInformation productInformation=new ProductInformation();
		
		ResponseEntity<ProductInformation> responsEntity=restTemplate.exchange(url, HttpMethod.GET, null, ProductInformation.class,id);
		
		return responsEntity.getBody();
	}
	
	public List<ProductInformation> findtheLimitProducts(int noOfProducts)
	{
		String url="https://fakestoreapi.com/products/?limit={noOfProducts}";
		
		
		RestTemplate restTemplate=new RestTemplate();
		
	return	restTemplate.exchange(url, HttpMethod.GET, null, List.class, noOfProducts).getBody();
	}



	public String validatingTheTokenService() {
		
		String url="http://localhost:7000/payment/generate/token";
		
		
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("Authorization", "venka123");
		
		HttpEntity httpEntity=new HttpEntity<>(httpHeaders);
		
		RestTemplate restTemplate=new RestTemplate();
	 return 	restTemplate.exchange(url, HttpMethod.GET,  httpEntity, String.class).getBody();
	}
	
	
	
}
