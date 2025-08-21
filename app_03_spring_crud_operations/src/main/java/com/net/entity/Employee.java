package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Employee {
	
	
	@Id
	private int employeeId;
	private String employeeName;
	private int salary;
	private String password;
	private String address;

}
