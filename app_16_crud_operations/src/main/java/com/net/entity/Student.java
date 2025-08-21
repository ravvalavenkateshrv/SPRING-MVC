package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Student {
	
	
	@Id
	@NotNull
	@NotEmpty
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private int age;
	private String course;

}
