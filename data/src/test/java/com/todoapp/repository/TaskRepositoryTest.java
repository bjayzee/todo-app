package com.todoapp.repository;

import com.todoapp.model.Tasks;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class TaskRepositoryTest {

    @Autowired
    Tasks tasks;
    TaskRepository taskRepository;
    @BeforeEach
    void setUp() {
    }

    @Test
    void findByName() {
    }
}