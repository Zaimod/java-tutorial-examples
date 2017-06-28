package org.o7planning.tutorial.beans;

public class UserInfo {

	public String userName;
	public String country;
	public int post;

	public UserInfo(String userName, String country, int post) {
		this.userName = userName;
		this.country = country;
		this.post = post;
	}

	public String getUserName() {
		return userName;
	}

	public void setName(String userName) {
		this.userName = userName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}
}
