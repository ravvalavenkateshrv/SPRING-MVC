package com.net.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class AmzaonDelivery {
	
	
	@Id
	private String email;
	private String name;
	private String mobileNumber;
	private int totalAmount;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "delivery_email") 
	private List<ProductInformation> productInformation;

}
