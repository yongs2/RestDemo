package com.jwinpartners.demo.rest.model;

import java.util.Date;


/**
 * 
 * http://www.dreamsyssoft.com/blog/blog.php?/archives/7-Simple-JAX-RS-Web-Service-in-Java-with-Spring-and-CXF.html
 * 
 * @author yongs2
 *
 */
public class User {
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private String city;
	private String state;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
