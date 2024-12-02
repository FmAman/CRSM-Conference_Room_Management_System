package com.galaxe.crsm.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.crsm.userservice.model.User;
import com.galaxe.crsm.userservice.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class LoginController {

	@Autowired
	UserRepository userRepository;

	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userRepository.findAll();
		System.out.println(users);
		if (users.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(users);
	}

}
