package com.praneeth;

import java.util.Date;

public class Student {

	private int id;
	private String username;
	private Date date;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
		public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
