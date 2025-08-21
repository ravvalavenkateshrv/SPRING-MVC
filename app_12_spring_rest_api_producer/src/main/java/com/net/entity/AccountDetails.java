package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AccountDetails {
	
	
	@Id
	private String accountNumber;
	private String password;
	private String name;
	private String email;
	private String phoneNumber;
	private double avaibleBalance;
	
	
	private String transactionId;
	


}
