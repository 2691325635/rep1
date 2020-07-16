package com.lxy.bean;

public class Person {
	 private String id;
	 private String name;
     private String username;
     private String password;
     private Integer age;
     private String describe;
     private Double height;
     public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		  return "Person [id=" + id + ", name=" + name + ", username=" + username
		   + ", password=" + password + ", age=" + age + ", describe=" + describe
		   + ", height=" + height + "]";
	}

}
