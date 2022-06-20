package com.rest.webService.restfulwebService;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Size;

public class User {
private Integer id;
@Size(min = 2 ,message = "Provide more than 2 char")
private String name;
private Date dob;



public User(Integer id, String name, Date dob) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
}
