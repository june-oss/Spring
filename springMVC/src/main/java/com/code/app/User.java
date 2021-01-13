package com.code.app;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private String id;
	private int age;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", birthDate=" + birthDate + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
