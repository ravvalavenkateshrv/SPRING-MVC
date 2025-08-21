package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserInformation {
	
	
	@Id
	private String emailId;
	
	private String mobileNumber;
	private String password;
	private int age;
	private String city;
	private String gender;
	private String qualification;
	private String country;

}
