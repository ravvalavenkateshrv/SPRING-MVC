package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.UserEntity;


@Repository
public interface SignUpRepository extends JpaRepository<UserEntity, String> {

}
