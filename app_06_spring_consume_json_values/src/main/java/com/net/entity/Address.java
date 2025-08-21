package com.net.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
	
	
	@Id
	private int addressId;
	private String street;

}
