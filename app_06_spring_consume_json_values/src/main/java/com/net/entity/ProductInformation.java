package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProductInformation {
	
	
	@Id
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	private String productInfo;

}
