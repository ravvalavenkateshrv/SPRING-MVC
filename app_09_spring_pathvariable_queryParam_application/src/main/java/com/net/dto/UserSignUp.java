package com.net.dto;

import lombok.Data;

@Data
public class UserSignUp {
	
    private String emailId;
	private String mobileNumber;
	private String password;
	private int age;
	private String city;
	private String gender;
	private String qualification;
	private String country;


}
