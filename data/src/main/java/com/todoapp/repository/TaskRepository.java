package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todoapp.model.Tasks;



public interface TaskRepository extends JpaRepository<Tasks, Integer> {
    Tasks findByName(String name);
}
