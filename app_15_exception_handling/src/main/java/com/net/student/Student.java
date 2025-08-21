package com.net.student;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Student {
	
	
	@NotNull
	@NotEmpty
	private String id;
	
	@NotNull
	@NotEmpty
	private String name;
	private int age;

}
