package com.vit.springsecurityjwt;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserFetchService userFetchService;
	
	
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    	 	
    		return new User(s, "password",
                    new ArrayList<>());
   
    }
}