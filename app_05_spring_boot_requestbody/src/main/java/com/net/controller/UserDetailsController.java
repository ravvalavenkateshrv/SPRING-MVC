package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.dto.UserDetailsDto;
import com.net.dto.UserDetailsResponse;
import com.net.dto.userDetailsLoginDto;
import com.net.entity.UserDetails;
import com.net.service.UserDetailsService;


@RestController
public class UserDetailsController {
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@PostMapping("/create/user")
	public UserDetails createUserDetails(@RequestBody UserDetailsDto userDetailsDto)
	{
	 UserDetails userDetails=new UserDetails();
	 
	
	 userDetails.setEmailId(userDetailsDto.getEmailId());
	 userDetails.setFirstName(userDetailsDto.getFirstName());
	 userDetails.setLastName(userDetailsDto.getLastName());
	 userDetails.setMobileNumber(userDetailsDto.getMobileNumber());
	 userDetails.setPassword(userDetailsDto.getPassword());
	 userDetails.setAge(userDetailsDto.getAge());

	String result=	userDetailsService.createuser(userDetails);
		
		
		return userDetails;
	}

	
	@PostMapping("/login")
	public String userDetailsLogin(@RequestBody userDetailsLoginDto loginDto)
	{
		
		UserDetails userDetails=new UserDetails();
		userDetails.setEmailId(loginDto.getEmailId());
		userDetails.setPassword(loginDto.getPassword());
		
		String result=userDetailsService.loginUser(userDetails);
		
		return result;
	}
	

}
