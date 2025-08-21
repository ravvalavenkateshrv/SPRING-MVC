package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private int age;

}
