package com.todo.todo.service;

import com.todo.todo.entity.Todo;
import com.todo.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements  TodoService{

   @Autowired //Because we want to use methods from db we need to connect the repo with the project
    private TodoRepo todoRepo;


    @Override
    public List<Todo> getAllTodo() {
        return todoRepo.findAll();
    }

    @Override
    public void saveTodo(Todo todo) {
            this.todoRepo.save(todo);
    }

    @Override
    public void updateTodo(Long id, Todo todo) {
        Todo todoFromDb = todoRepo.findById(id).get();
        todoFromDb.setTaskName(todo.getTaskName());
        todoFromDb.setDesc(todo.getDesc());
        todoRepo.save(todoFromDb);

    }

    @Override
    public Todo getTodoById() {
        return null;
    }


    @Override
    public void deleteTodo(Long id) {
        this.todoRepo.deleteById(id);

    }

    @Override
    public List<Todo> getAllToDo() {
        return List.of();
    }

    @Override
    public Todo getTodoById(Long id) {
        Optional <Todo> optional = todoRepo.findById(id);
        Todo todo;

        if (optional.isPresent()){
            todo = optional.get();
        }else{
            throw new RuntimeException("To id "+ id + " not found");
        }
        return todo;
    }
}
