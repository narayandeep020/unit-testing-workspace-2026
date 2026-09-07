package com.junit5.vogella;

public class UserService {

	private final UserRepository userRepository;
	private final EmailService emailService;

	public UserService(UserRepository userRepository, EmailService emailService) {
		super();
		this.userRepository = userRepository;
		this.emailService = emailService;
	}

	public boolean registerUser(String name, String email) {
		if (userRepository.emailExists(email)) {
			return false;
		}
		User user = new User(name, email);
		userRepository.save(user);

		return emailService.sendWelcomeEmail(name, email);
	}

	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
