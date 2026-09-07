package com.junit5.vogella;

public interface UserRepository {

	void save(User user);

	User findByEmail(String email);

	boolean emailExists(String email);
}
