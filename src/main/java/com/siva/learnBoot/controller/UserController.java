package com.siva.learnBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.learnBoot.dto.UserRequest;
import com.siva.learnBoot.entity.User;
import com.siva.learnBoot.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@RequestBody UserRequest request){
		return new ResponseEntity<>(service.saveUser(request), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<User>> getAllUser() {
		
		
		return ResponseEntity.ok(service.getAllUser());
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) {
		return ResponseEntity.ok(service.getUser(id));
		
	}
	

}
