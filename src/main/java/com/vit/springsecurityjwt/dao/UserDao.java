package com.vit.springsecurityjwt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vit.springsecurityjwt.models.Usermodel;
@Service
public class UserDao {
	
	@Autowired
	UserRepository userRepository;
	
	public void insertUser(Usermodel usermodel) {
		userRepository.save(usermodel);
	}
	
	public Usermodel findUser(String username) {
		return userRepository.findByUsername(username);
	}

}
