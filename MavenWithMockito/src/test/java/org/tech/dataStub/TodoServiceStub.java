package org.tech.dataStub;

import java.util.Arrays;
import java.util.List;

import org.tech.dataApi.TodoService;

public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user){
		return Arrays.asList("Learn Spring", "Learn Maven Spring", "Learn JUnit");
	}
	public void deleteTodo(String todo) {}
}
