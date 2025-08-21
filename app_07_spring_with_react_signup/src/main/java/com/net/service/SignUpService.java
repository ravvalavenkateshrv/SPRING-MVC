package com.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.UserEntity;
import com.net.repository.SignUpRepository;

@Service
public class SignUpService {
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	
	public String signUpMethod(UserEntity userEntity)
	{
		
		signUpRepository.save(userEntity);
		return "SUCCESSFULLY CREATED";
	}

}
