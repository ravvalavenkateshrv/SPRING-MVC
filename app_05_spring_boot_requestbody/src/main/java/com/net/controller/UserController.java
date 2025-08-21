package com.net.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.UserSignUp;

@RestController

public class UserController {
	
	
	


	@PostMapping("/signup")
	
	public String signUp(@RequestBody  UserSignUp userSignUp)
	{
		
		System.out.println(userSignUp);
		return "Successfully created";
	}
	
	
	@PostMapping(path="/create",produces=MediaType.APPLICATION_XML_VALUE)
	public UserSignUp signUpuser()
	{
		
		UserSignUp userSignUp=new UserSignUp();
		userSignUp.setId(1);
		userSignUp.setAddress("tirupait");
		userSignUp.setCourse("Java");
		userSignUp.setName("venkat");
		return userSignUp;
		
		
	}

}
