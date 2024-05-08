package com.todo.todo.repository;


import com.todo.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo  extends JpaRepository<Todo,Long> {

}
