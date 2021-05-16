package com.vit.springsecurityjwt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AuthenticUsers")
public class Usermodel {

	@Id
	String username;
	String password;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param username
	 * @param password
	 */
	public Usermodel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * 
	 */
	public Usermodel() {
		super();
	}
	@Override
	public String toString() {
		return "Usermodel [username=" + username + ", password=" + password + "]";
	}
	
}
