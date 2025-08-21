package com.net.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.UserInformation;

@Repository
public interface UserInformationRepository extends JpaRepository<UserInformation, String> {
	
	public List<UserInformation> findByCityAndCountry(String city,String country);
	
	public UserInformation findByEmailIdAndPassword(String emailId,String password);
	
	public List<UserInformation> findByCountry(String country);
	
	public List<UserInformation> findByGender(String gender);

	public List<UserInformation> findByGenderAndCountry(String gender, String country);

	
	public List<UserInformation> findByCity(String city);
	
}
