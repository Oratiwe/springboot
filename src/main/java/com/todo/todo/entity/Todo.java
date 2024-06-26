package com.todo.todo.entity;


import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.Instant;

@Getter
@Setter
@Entity

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long id;


     @NonNull
     private String taskName;

     @NonNull
     private String description;

     @CreationTimestamp
     private Instant dateCreated;

}
