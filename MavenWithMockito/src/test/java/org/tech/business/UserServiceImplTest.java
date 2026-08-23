package org.tech.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.tech.dataApi.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

	@Mock 
	private UserService userService;
	
	@InjectMocks
	private UserServiceImpl serviceImpl;
	
	@Test
	public void testGetUserEmailFormatted_Success(){
		Long userId = 1L;
		String mockEmail = "test@example.com";
		when(userService.findEmailById(userId)).thenReturn(Optional.of(mockEmail));
		
		String result = serviceImpl.getUserEmailFormatted(userId);
		
		assertEquals("User Email:test@example.com",result);
		 verify(userService).findEmailById(userId);
	}
	
	@Test
	 public void testGetUserEmailFormatted_NotFound() {
		Long userId = 2L;
		when(userService.findEmailById(userId)).thenReturn(Optional.empty());
		
		String result = serviceImpl.getUserEmailFormatted(userId);
		
		assertEquals("Email Not Found",result);
		verify(userService).findEmailById(userId);
	}

}
