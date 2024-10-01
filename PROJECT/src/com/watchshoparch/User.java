package com.watchshoparch;

public class User {

	private String uname,upwd;

	public User(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}

	public User() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
