package com.junit5.vogella;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	UserRepository userRepository;

	@Mock
	EmailService emailService;

	@Test
	void testSuccessfulUserRegistration() {
		when(userRepository.emailExists("john@example.com")).thenReturn(false);
		when(emailService.sendWelcomeEmail("John", "john@example.com")).thenReturn(true);

		UserService userService = new UserService(userRepository, emailService);

		boolean result = userService.registerUser("John", "john@example.com");
		assertTrue(result);

		verify(userRepository).save(any(User.class));
		verify(emailService).sendWelcomeEmail("John", "john@example.com");
	}

	@Test
	void testUserRegistrationWithExistingEmail() {
		when(userRepository.emailExists("existing@example.com")).thenReturn(true);

		UserService userService = new UserService(userRepository, emailService);

		assertFalse(userService.registerUser("Jane", "existing@example.com"));
	}

//	Argument verification and capturing
	@Test
	void testArgumentVerification() {
		UserService userService = new UserService(userRepository, emailService);

		userService.registerUser("Deep Deo", "deep@example.com");

		verify(emailService).sendWelcomeEmail("Deep Deo", "deep@example.com");
		verify(userRepository)
				.save(argThat(user -> user.getName().equals("Deep Deo") && user.getEmail().equals("deep@example.com")));

// Capture arguments for complex verification
		ArgumentCaptor<User> userCaptor = ArgumentCaptor.forClass(User.class);
		verify(userRepository).save(userCaptor.capture());

		User capturedUser = userCaptor.getValue();
		assertEquals("deep@example.com", capturedUser.getEmail());
		assertFalse(capturedUser.isVerified()); // New users start unverified
	}

//	 Testing exception scenarios
	@Test
	void testDatabaseConnectionFailure() {
		// Simulate database failure
		doThrow(new RuntimeException("Database connection failed")).when(userRepository).save(any(User.class));

		UserService userService = new UserService(userRepository, emailService);

		// Verify exception handling
		assertThrows(RuntimeException.class, () -> {
			userService.registerUser("Test User", "test@example.com");
		});

		// Ensure email is not sent when database fails
		verify(emailService, never()).sendWelcomeEmail(anyString(), anyString());
	}

//	Testing with multiple mock interactions
	@Test
	void testMultipleUserOperations() {
		UserService userService = new UserService(userRepository, emailService);

		when(userRepository.emailExists(anyString())).thenReturn(false).thenReturn(true);
		when(emailService.sendWelcomeEmail(anyString(), anyString())).thenReturn(true);

		assertTrue(userService.registerUser("User One", "user1@example.com"));
		assertFalse(userService.registerUser("User Two", "user1@example.com"));

		verify(userRepository, times(2)).emailExists("user1@example.com");
		verify(emailService, times(1)).sendWelcomeEmail(anyString(), anyString());
	}
}
