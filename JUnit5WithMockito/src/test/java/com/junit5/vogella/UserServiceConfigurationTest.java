package com.junit5.vogella;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceConfigurationTest {

	@Mock
	UserRepository userRepository;

	@Mock
	EmailService emailService;

	@Test
	void ensureEmailServiceReturnsConfiguredValue() {
		when(emailService.sendWelcomeEmail("John", "john@example.com")).thenReturn(true);

		UserService userService = new UserService(userRepository, emailService);

		assertTrue(emailService.sendWelcomeEmail("John", "john@example.com"));

	}

	@Test
	void testUserRepositoryMockConfiguration() {
		User mockUser = new User("Test User", "test@example.com");

		when(userRepository.findByEmail("test@example.com")).thenReturn(mockUser);

		UserService userService = new UserService(userRepository, emailService);
		User result = userService.getUserByEmail("test@example.com");

		assertEquals("test@example.com", result.getEmail());
		assertEquals("Test User", result.getName());
	}

	@Test
	void testVerifyMethodCalls() {
		when(userRepository.emailExists("test@example.com")).thenReturn(false);
		when(emailService.sendWelcomeEmail("Test User", "test@example.com")).thenReturn(true);

		UserService userService = new UserService(userRepository, emailService);
		userService.registerUser("Test User", "test@example.com");
		User user = userService.getUserByEmail("test@example.com");

		verify(userRepository).emailExists(eq("test@example.com"));
		verify(userRepository).save(any(User.class));
		verify(emailService).sendWelcomeEmail(eq("Test User"), eq("test@example.com"));
		verify(userRepository, times(1)).save(any(User.class));
//		verify(userRepository, times(2)).findByEmail("test@example.com");
		verify(emailService, never()).sendVerificationEmail(anyString(), anyString());
		verify(userRepository, never()).emailExists("different@example.com");
		verify(userRepository, atLeastOnce()).emailExists("test@example.com");
		verify(userRepository, atLeast(1)).save(any(User.class));
	}
}
