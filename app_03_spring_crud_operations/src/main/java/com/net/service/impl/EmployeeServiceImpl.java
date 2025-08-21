package com.net.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.Employee;
import com.net.repository.EmployeeRepository;
import com.net.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public boolean isEmployeeExisted(int id)
	{
		return employeeRepository.existsById(id);
	}
	
	
	

	@Override
	public String signupStudent(Employee employee) {
		
		
		if(!(isEmployeeExisted(employee.getEmployeeId())))
		{
			System.out.println("Student Exited  success");
			employeeRepository.save(employee);
			return "Emloyee successfully signup";
		}else
		{
			System.out.println("Student Exited failure");
			return "Employee Already existed";
			
		}
	
		
	
	}




	@Override
	public List<Employee> getAllStudents() {
		
		return employeeRepository.findAll() ;
	}



	

	@Override
	public String deleteEmployee(int id){
		
		
		if(employeeRepository.existsById(id))
		{
			employeeRepository.deleteById(id);
			return "Employee Successfully Deleted";
		}else
		{
			return "Employee Did not found";
		}
		
	}

}
