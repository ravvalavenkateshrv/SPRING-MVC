package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserDetails {
	
	
	@Id
	private String emailId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String password;
	private int age;

}
