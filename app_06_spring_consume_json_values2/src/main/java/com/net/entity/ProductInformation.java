package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductInformation {
	
	
	@Id
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	private String specifications;

}
