package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.UserData;
import com.net.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserDataController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/create/user")
	public String createUser(@Valid @RequestBody UserData userData)
	{
		System.out.println(userData);
		return userService.createUser(userData);
	}

}
