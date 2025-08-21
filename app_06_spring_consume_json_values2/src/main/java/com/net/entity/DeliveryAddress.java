package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DeliveryAddress {
	
	@Id
	private int adddressId;
	private String streetName;
	private String buildingName;
	private String flatNumber;
	private String city;
	private String state;
	private int pinCode;

}
