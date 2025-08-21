package com.net.service;

import java.util.List;

import com.net.entity.Employee;

public interface EmployeeService {
	
	public String signupStudent(Employee employee);
	public List<Employee> getAllStudents();
	
	
	public String deleteEmployee(int id);


}
