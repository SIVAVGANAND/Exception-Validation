package com.siva.learnBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siva.learnBoot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

}
