package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

	    @Id
	    
	    private Long id;             
	    private String name;         
	    private String description;  
	    private double price;        
	    private int quantity;        
	    private String category;    
	    private String brand;        
}
