package com.app.todoapp.models;

//will translate data into database table

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //Id field and will auto generate the id

    private Long id;
    private String title;
    private boolean completed;  //wheter task is completed




}
