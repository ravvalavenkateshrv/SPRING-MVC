package com.net.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.User;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class UserControllerTwo {
	
	
	@GetMapping("/user/login")
    public ResponseEntity<User> getUserLogin() {
        boolean validUser = true;
        ResponseEntity<User> responseEntity = null;
        User user = null;

        HttpHeaders httpHeaders = new HttpHeaders();

        if (validUser) {
            System.out.println("************************");

            // ✅ generate token
            String token = UUID.randomUUID().toString();

            // ✅ create user
            user = new User(1, "venkat", "venkatyadav@gmail.com", "venkat143@vyv");

            // ✅ add token to ResponseEntity headers
            httpHeaders.add("security-token", token);

            // ✅ print token (from variable, not HttpServletResponse)
            System.out.println("Generated security-token: " + token);

            // ✅ build response
            responseEntity = new ResponseEntity<>(user, httpHeaders, HttpStatusCode.valueOf(200));
            System.out.println(responseEntity);

            return responseEntity;

        } else {
            System.out.println("+++++++++++++++++++++++++++++=");
            return new ResponseEntity<>(user, httpHeaders, HttpStatusCode.valueOf(401));
        }
    }

}
