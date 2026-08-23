package org.tech.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.tech.dataApi.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testUsingMock() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring", "Learn Maven Spring", "Learn JUnit");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todos1 = todoImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, todos1.size());
	}

	
	@Test
	public void testUsingEmptyList() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todos = Arrays.asList();
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todos1 = todoImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, todos1.size());
	}
}
