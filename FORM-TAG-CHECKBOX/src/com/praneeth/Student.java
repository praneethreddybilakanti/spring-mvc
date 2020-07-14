package com.praneeth;

import java.util.List;

public class Student {

	
	private String username;
	private int number;
    private String Gender;  
private List<String> hobbies;
public void setHobbies(List<String> hobbies) {
	this.hobbies = hobbies;
}
public List<String> getHobbies() {
	return hobbies;
}
    public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getGender() {
		return Gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
		
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
