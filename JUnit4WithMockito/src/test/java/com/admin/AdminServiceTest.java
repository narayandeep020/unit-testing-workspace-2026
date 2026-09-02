package com.admin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
public class AdminServiceTest {

	@Mock
	private AdminDao adminDao;

	@InjectMocks
	private AdminService adminService;

	@Captor
	private ArgumentCaptor<AdminDto> dtoCaptor;

	@Test
	public void testSaveAdmin() {
		AdminDto dto = new AdminDto("Deep");

		when(adminDao.save(dto)).thenReturn(true);

		boolean result = adminService.saveAdmin(dto);

		verify(adminDao).save(dtoCaptor.capture());
		assertEquals("Deep", dtoCaptor.getValue().getName());

		assertTrue(result);
	}

	@Test
	public void testSaveAdminWithHamcrest() {
		AdminDto dto = new AdminDto("Deep");

		when(adminDao.save(dto)).thenReturn(true);

		boolean result = adminService.saveAdmin(dto);

		// Verify interaction
		verify(adminDao).save(dtoCaptor.capture());

		// Hamcrest assertions
		assertThat(result, is(true));
		assertThat(dtoCaptor.getValue().getName(), equalTo("Deep"));
		assertThat(dtoCaptor.getValue().getName(), startsWith("De"));
		assertThat(dtoCaptor.getValue().getName(), not(emptyOrNullString()));

	}
}
