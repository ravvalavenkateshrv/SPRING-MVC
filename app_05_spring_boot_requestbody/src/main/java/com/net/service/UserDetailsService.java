package com.net.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.dto.userDetailsLoginDto;
import com.net.entity.UserDetails;
import com.net.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public boolean userExistedOrNot(String email)
	{
		return userDetailsRepository.existsById(email);
	}
	
	
	

	public String createuser(UserDetails userDetails) {
		
	if(userExistedOrNot(userDetails.getEmailId()))
	{
		return "USER ALREADY EXISTED";
	}else
	{
		userDetailsRepository.save(userDetails);
		return "USER CREATED SUCCESSFULLY";
	}	
	}
	public String loginUser(UserDetails userDetails) {
		
		if(userDetailsRepository.existsById(userDetails.getEmailId()))
		{
			
			UserDetails user=userDetailsRepository.findByEmailIdAndPassword(userDetails.getEmailId(), userDetails.getPassword());
			
			if(user!=null)
			{
				return "SUCCESSFULLY USER LOGIN";
			}
			else
			{
				return "USER EMAIL OR PASSWORD WRONG";
			}
			
		}else
		{
			return "USER EMAIL ID IS NOT EXISTED";
		}
	
		
		
	}
	

}
