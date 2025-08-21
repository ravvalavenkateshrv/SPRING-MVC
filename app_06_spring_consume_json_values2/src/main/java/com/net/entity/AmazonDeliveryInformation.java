package com.net.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class AmazonDeliveryInformation {
	
	@Id
	private String emailId;
	private String mobileNumber;
	private String name;
	private double totalAmount;
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="delivery_id")
	private List<ProductInformation> products;
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="delivery_id")
	private List<DeliveryAddress> deliveryAddress;
	
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="delivery_id")
	private PaymentStatus paymentStatus;
}
