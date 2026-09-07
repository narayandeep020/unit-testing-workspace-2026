package com.junit5.user;

public class UserService {
	private final UserRepository repository;

	public UserService(UserRepository repository) {
		this.repository = repository;
	}

	public String getUserName(String id) {
		User user = repository.findById(id);
		if (user == null) {
			throw new IllegalArgumentException("User not found");
		}
		return user.getName();
	}
}
