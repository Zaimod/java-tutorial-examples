package org.o7planning.springmvchibernatesecurity.model;

public class UserInfo {

	private String username;
	private String password;

	public UserInfo() {

	}

	// Do not change this constructor, it used in hibernate Query.
	public UserInfo(String username, String password) {
		this.username = username;
		this.password = password;
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

}