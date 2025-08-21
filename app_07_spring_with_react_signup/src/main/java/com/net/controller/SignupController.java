package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.net.dto.SignUpDto;
import com.net.entity.UserEntity;
import com.net.service.SignUpService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/user")
public class SignupController {
	
	@Autowired
	private SignUpService signUpService;

	@PostMapping("/create/user")
	public String createuser(@RequestBody SignUpDto signUpDto)
	{
		
		
		UserEntity user=new UserEntity();
		user.setId(signUpDto.getId());
		user.setFirstName(signUpDto.getFirstName());
		user.setLastName(signUpDto.getLastName());
		user.setPassword(signUpDto.getPassword());
		user.setMailId(signUpDto.getMailId());
		user.setAddress(signUpDto.getAddress());
		user.setMobileNumber(signUpDto.getMobileNumber());
		
		
	return signUpService.signUpMethod(user);
		
	}
}
