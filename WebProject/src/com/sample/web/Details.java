package com.sample.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="LOGIN") 
public class Details {
	@Id 
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	@Column(name="Email_ID")
	private String email;
	@Column(name="Full_Name")
	private String fullName;
	
	
	
	public Details(String username, String password, String email, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullName = fullName;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
