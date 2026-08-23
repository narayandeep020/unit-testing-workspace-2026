package org.tech.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.tech.dataApi.TodoService;
import org.tech.dataStub.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testUsingStub() {
		
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoImpl.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}

}
