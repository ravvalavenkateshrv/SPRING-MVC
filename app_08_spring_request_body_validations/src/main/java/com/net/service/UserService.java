package com.net.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.UserData;
import com.net.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String createUser(UserData user) {
	    Optional<UserData> existingUser = userRepository.findById(user.getEmailId());

	    if (existingUser.isPresent()) {
	        return "User already exists";
	    }

	    userRepository.save(user);
	    return "User created successfully";
	}

}
