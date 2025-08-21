package com.net.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.Student;


@Repository
public interface StudenRepository extends JpaRepository<Student, Integer> {
	
	public Student findByIdAndPassword(int id, String password);

}
