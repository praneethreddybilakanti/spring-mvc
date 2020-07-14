package com.praneeth;

public class Student {

	
	private String username;
	private int password;
    private String Gender;  

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
		
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
