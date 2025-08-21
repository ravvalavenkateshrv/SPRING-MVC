package com.net.entity.dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Student {
	

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String course;

	
	

}
