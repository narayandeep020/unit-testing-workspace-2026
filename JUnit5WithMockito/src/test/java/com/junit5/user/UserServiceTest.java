package com.junit5.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // Enables Mockito in JUnit 5
class UserServiceTest {

	@Mock
	private UserRepository repository; // Mock dependency

	@InjectMocks
	private UserService service; // Class under test

	@BeforeEach
	void setUp() {
		System.out.println("Run Before Each Test");
	}

	@Test
	public void testGetUserName_Success() {
		User mockUser = new User("1", "Alice");
		when(repository.findById("1")).thenReturn(mockUser);

		String name = service.getUserName("1");

		assertEquals("Alice", name);
		verify(repository, times(1)).findById("1");
	}

	@Test
	public void testGetUserName_UserNotFound() {
		when(repository.findById("2")).thenReturn(null);

		Exception ex = assertThrows(IllegalArgumentException.class, () -> service.getUserName("2"));
		assertEquals("User not found", ex.getMessage());
		verify(repository, times(1)).findById("2");
	}
}
