package org.tech.business;

import java.util.ArrayList;
import java.util.List;

import org.tech.dataApi.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		
		for(String todo : allTodos) {
			if(todo.contains("Spring"))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}
	
	public void deleteTodosNotRelatedToSpring(String user) {
		List<String> allTodos = todoService.retrieveTodos(user);
		for(String todo : allTodos) {
			if(!todo.contains("Spring"))
				todoService.deleteTodo(todo);
		}
	}
}
