package com.net.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.net.entity.UserInformation;
import com.net.repository.UserInformationRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	
	@Autowired
	private UserInformationRepository userRepository;
	
	
	public UserInformation creatingTheuser(UserInformation userInformation)
	{
		
		return userRepository.save(userInformation);
		
		
	}


	public List<UserInformation> loadAllUsers() {
		
		return userRepository.findAll();
		
	}


	public UserInformation findTheuserInformation(String emailId) {
	
		Optional<UserInformation> user= userRepository.findById(emailId);
		if(user.isPresent())
		{
			return user.get();
		}
		else
		{
		return null;
		}
	}


	public List<UserInformation> getUserCityAndCountry(String city, String country) {
	
		return userRepository.findByCityAndCountry(city, country);
	}


	public UserInformation getTheUserInformationDetails(String emailId, String password) {
	
		return userRepository.findByEmailIdAndPassword(emailId, password);
	}


	public List<UserInformation> getTheDetailsCountry(String country) {
	
		return userRepository.findByCountry(country);
	}


	public List<UserInformation> findTheDetailsGender(String gender) {
		
		return userRepository.findByGender(gender);
	}


	public List<UserInformation> findTheDetailsGenderandCountry(String gender, String country) {
	
		return userRepository.findByGenderAndCountry( gender, country);
	}

public List<UserInformation> findTheDetailsCity(String city) {
		
		return userRepository.findByCity(city);
	}


public UserInformation changeThePassword(String emailId,String newPassword) {

	Optional<UserInformation> optUser=userRepository.findById(emailId);
	if(optUser.isPresent())
	{
		UserInformation user=optUser.get();
		user.setPassword(newPassword);
		
	return 	userRepository.save(user);
		
		
		
	}else
	{
		return null;
	}
	
	

}


@Transactional
@Modifying
public String deleteTheUser(String emailId) {

	 Optional<UserInformation> optUser=userRepository.findById(emailId);
	 if(optUser.isPresent())
	 {
		 userRepository.deleteById(emailId);
		 return "USER SUCCESSFULLY DELTED";
	 }
	 else
	 {
		 return "USER DID NOT EXISTED";
	 }
	
}
}
