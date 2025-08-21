package com.net.entity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile(value="dev")
@Component
public class Student {
	
	public Student()
	{
		System.out.println("**********Student object is created**************************");
	}

}
