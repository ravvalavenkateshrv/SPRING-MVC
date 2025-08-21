package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.net.dto.UserSignUp;
import com.net.entity.UserInformation;
import com.net.service.UserService;

@RestController
@RequestMapping("/param")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/create/user")
	public UserInformation signUpTheUser(@RequestBody UserSignUp userSignUp)
	{
		
		
		UserInformation user=new UserInformation();
		user.setEmailId(userSignUp.getEmailId());
		user.setMobileNumber(userSignUp.getMobileNumber());
		user.setPassword(userSignUp.getPassword());
		user.setAge(userSignUp.getAge());
		user.setCity(userSignUp.getCity());
		user.setCountry(userSignUp.getCountry());
		user.setGender(userSignUp.getGender());
		user.setCountry(userSignUp.getCountry());
		user.setQualification(userSignUp.getQualification());
		
		System.out.println(user);
		
		return userService.creatingTheuser(user);
	}
	
	@GetMapping("/all/users")
	public List<UserInformation> getTheAllusers()
	{
		return userService.loadAllUsers();
	}
	
	@GetMapping("user/info/{emailId}")
	public UserInformation getTheUserInforamtion(@PathVariable("emailId")String emailId)
	{
		return userService.findTheuserInformation(emailId);
	}
	
	
	@GetMapping("user/info/{city}/{country}")
	public List<UserInformation> getCityAndCountry(@PathVariable String city,@PathVariable String country)
	{
		
		return userService.getUserCityAndCountry(city,country);
	}
	
	@GetMapping("user/login/{emailId}/{password}")
	public UserInformation getUserDetails(@PathVariable String emailId,@PathVariable String password)
	{
		System.out.println(userService.getTheUserInformationDetails(emailId,password));
		return userService.getTheUserInformationDetails(emailId,password);
	}
	@GetMapping("user/info/country/{country}")
	public List<UserInformation> getDetailsCountry(@PathVariable String country)
	{
		return userService.getTheDetailsCountry(country);
	}
}
