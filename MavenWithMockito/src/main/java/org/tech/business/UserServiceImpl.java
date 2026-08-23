package org.tech.business;

import org.tech.dataApi.UserService;

public class UserServiceImpl {

	private final UserService userService;

	public UserServiceImpl(UserService userService) {
		super();
		this.userService = userService;
	}

	public String getUserEmailFormatted(Long id) {
		return userService.findEmailById(id)
				.map(email -> "User Email:" + email)
				.orElse("Email Not Found");
	}
}
