package com.todo.todo.service;
import com.todo.todo.entity.Todo;
import java.util.List;

public interface TodoService  {

    List <Todo> getAllTodo();

    void  saveTodo(Todo todo);

    void updateTodo(Long id, Todo todo);

    Todo getTodoById();

    void  deleteTodo(Long id);

    List<Todo> getAllToDo();

    Todo getTodoById(Long id);
}
