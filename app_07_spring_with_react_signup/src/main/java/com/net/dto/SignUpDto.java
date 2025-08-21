package com.net.dto;

import com.net.entity.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class SignUpDto {
	

	
	private String id;
	private String firstName;
	private String lastName;
	private String password;
	private String mailId;
	private long mobileNumber;
	private String address;

}
