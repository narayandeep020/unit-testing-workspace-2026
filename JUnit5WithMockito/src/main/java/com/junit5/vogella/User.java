package com.junit5.vogella;

public class User {

	private String name;
	private String email;
	private boolean verified;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
		this.verified = false;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}
}
