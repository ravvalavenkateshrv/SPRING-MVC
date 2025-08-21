package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.UserData;


@Repository
public interface UserRepository extends JpaRepository<UserData,String> {

}
