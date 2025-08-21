package com.net.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.User;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	
	@GetMapping("/get/user/{email}")
	public User getTheuserDetails(@PathVariable String email, @RequestHeader("securit-token") String token)
	{
		
		return new User(1,"venkat","venkatyadav@gmail.com","venkat143@vyv");
	}
	
	@GetMapping("/get/user/details/{email}")
	public User getTheuserDetails2(@PathVariable String email, @RequestHeader("securit-token") String token,HttpServletRequest request)
	{
		
		System.out.println(request.getHeader("User-Agent"));
		
		
		
		return new User(1,"venkat","venkatyadav@gmail.com","venkat143@vyv");
	}

	@GetMapping("/user/login/{email}")
	public User getTheuserLogin(@PathVariable String email,HttpServletRequest request)
	{
		System.out.println("EXPECTED FROM THE USE RLOING");
		
		System.out.println(request.getHeader("User-Agent")+"************************");
		System.out.println(request.getHeader("securit-token")+"********************");
		
		
		
		return new User(1,"venkat","venkatyadav@gmail.com","venkat143@vyv");
	}

}
