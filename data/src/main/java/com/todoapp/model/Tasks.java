package com.todoapp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
public class Tasks {
    @Id
    private Integer id;

    @Column(unique = true)
    private String name;

    private String description;


   private LocalTime time;


   private LocalDate calendar;

    private Category category;

    private String note;

}
