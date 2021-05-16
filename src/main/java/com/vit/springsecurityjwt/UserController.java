package com.vit.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vit.springsecurityjwt.models.Usermodel;

@RestController
public class UserController {
	
	@Autowired
	UserFetchService userfetchservice;

	
	@RequestMapping(value = "/insertUserData", method = RequestMethod.POST)
	public ResponseEntity<?> insertUser(@RequestBody Usermodel usermodel){
		userfetchservice.insertUser(usermodel);
		return ResponseEntity.ok("User has been added sucessfully!!");
	}

}
