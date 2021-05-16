package com.vit.springsecurityjwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vit.springsecurityjwt.models.Usermodel;

@Repository
public interface UserRepository extends JpaRepository<Usermodel, String>{

	Usermodel findByUsername(String username);

}
