package com.vit.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vit.springsecurityjwt.dao.UserDao;
import com.vit.springsecurityjwt.models.Usermodel;
@Service
public class UserFetchService {

	@Autowired	
	UserDao userdao;

	public void insertUser(Usermodel usermodel) {
		userdao.insertUser(usermodel);
	}
	
	public Usermodel findUser (String username) {
		return userdao.findUser(username);
	}
}
