package com.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Detail")
public class UserAccess {
	@Column(name = "username")
private String username;
	@Column(name = "email")
private String email;
@Id
@Column(name = "id")
private Long id;
@Column(name = "password")
private String password;


public String getUserName() {
	return username;
}
public void setUserName(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "UserDetails [userName=" + username + ", email=" + email + ", password=" + password + "]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
