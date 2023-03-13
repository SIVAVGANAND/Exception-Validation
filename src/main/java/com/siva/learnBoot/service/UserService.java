package com.siva.learnBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.learnBoot.dto.UserRequest;
import com.siva.learnBoot.entity.User;
import com.siva.learnBoot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User saveUser(UserRequest request) {
		User user=User.build(0, request.getName(), request.getEmail(), request.getMobile(), request.getGender(),request.getAge(), request.getNationality());
		return repository.save(user);
	}
	
	public List<User> getAllUser(){
		 return repository.findAll();
	}
	
	public User getUser(int id) {
		return repository.findByUserId(id);
		
	}

}
