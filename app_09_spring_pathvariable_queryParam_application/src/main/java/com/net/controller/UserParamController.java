package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.net.dto.UpdatPasswordDto;
import com.net.entity.UserInformation;
import com.net.repository.UserInformationRepository;
import com.net.service.UserService;

@RestController
@RequestMapping("/api")
public class UserParamController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/user")
	public List<UserInformation>  getDetailsByGender(@RequestParam String gender)
	{
		
		return userService.findTheDetailsGender(gender); 
		
	}
	
	@GetMapping("/user/find")
	public List<UserInformation>  getDetailsByGenderandCountry(@RequestParam String gender,@RequestParam String country)
	{
		
		return userService.findTheDetailsGenderandCountry(gender,country); 
		
	}
	
	
	@GetMapping("/user/search")
	public List<UserInformation> getDetails(@RequestParam(required=false)String country,@RequestParam(required=false)String city)
	{
		if(country==null && city==null)
		{
			return userService.loadAllUsers();
		}else if(country==null && city!=null)
		{
			return userService.findTheDetailsCity(city);
		}else if(country!=null && city==null)
		{
			return userService.getTheDetailsCountry(country);
		}
		else if(country!=null && city!=null)
		{
			return userService.getUserCityAndCountry(city, country);
		}
		
		return null;
		
	}
	
	@PutMapping("user/update/{emailId}")
	public UserInformation updataThePassword(@RequestBody UpdatPasswordDto updataPassword, @PathVariable String emailId)
	{
		
		
		return userService.changeThePassword(emailId,updataPassword.getNewPassword());
	}
	
	@DeleteMapping("/user/delete/{emailId}")
	public String deletTheUser(@PathVariable String emailId)
	{
		return userService.deleteTheUser(emailId);
	}
	

}
