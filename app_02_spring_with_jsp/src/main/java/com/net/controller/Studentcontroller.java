package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.net.entity.Student;
import com.net.repo.StudentRepository;
import com.net.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Studentcontroller {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/show/form")
	public String showForm()
	{
		return "student";
	}
	
	
	@PostMapping("create/student")
	public String saveStudent(HttpServletRequest request,@ModelAttribute Student student)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		int age=Integer.parseInt(request.getParameter("age"));
		String name=request.getParameter("name");
		
		
	   if( studentService.isStudentExisted(id))
	   {
		   System.out.println("Inserted failure");
		   return "failure";
	   }
	   else
	   {
		studentService.createStudent(student);
		System.out.println(name+","+age+","+id);
		
		return "success";
	   }
	}
	
	
	@GetMapping("/all/students")
	public String findAllStudents(Model model)
	{
		model.addAttribute("students",studentService.getAllStudents());
		
		return "allstudents";
	}
	
	
	@GetMapping("delete/form")
	public String deleteForm()
	{
		
		return "delete_form";
	}
	
	@PostMapping("delete/student")
	public String deleteStudenId(HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		studentRepository.deleteById(id);
		
		return "success";
	}
	
	@PostMapping("save/student")
	public ModelAndView saveStudent(@ModelAttribute Student student)
	{
		ModelAndView  mv=new ModelAndView();
		
		String result="Successfully created";
		studentRepository.save(student);
		mv.setViewName("success");
		mv.addObject("result",result);
		
		return mv;
	}
	

	@GetMapping("/show/form")
	public String showsForm()
	{
		return "student";
	}

	@GetMapping("/show/form")
	public String showFosrm()
	{
		return "student";
	}
	

}
