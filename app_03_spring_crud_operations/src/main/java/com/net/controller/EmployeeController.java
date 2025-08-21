package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.net.entity.Employee;
import com.net.service.impl.EmployeeServiceImpl;


@Controller
public class EmployeeController {

	
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	
	
	@GetMapping("/show/form")
	public String showForm()
	{
		return "signup";
	}
	
	@PostMapping("/signup")
	public ModelAndView signUp(@ModelAttribute Employee employee)
	{
		
		ModelAndView mv=new ModelAndView();
		
		String result=employeeService.signupStudent(employee);
	
		mv.setViewName("result");
		mv.addObject("result",result);
		
		
		return mv;
	}
	
	@GetMapping("/all/students")
	public ModelAndView findAllStudents()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("allstudents");
		mv.addObject("students",employeeService.getAllStudents());
		return mv;
	}
	
	@GetMapping("/delete/form")
	public String showDeleteForm()
	{
		return "delete_form";
	}
	
	
	@PostMapping("/delete/employee")
	public ModelAndView deleteeFrommployee(@RequestParam ("id") int id)
	{
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result_delete");
		mv.addObject("result", employeeService.deleteEmployee(id));
		return mv;
		
	}
}
