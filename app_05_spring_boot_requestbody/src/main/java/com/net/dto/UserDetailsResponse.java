package com.net.dto;

import lombok.Data;

@Data
public class UserDetailsResponse {

	
	private String emailId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String password;
	private int age;
}
