package com.todoapp.Task;

import com.todoapp.model.Tasks;

public interface TaskService {
    Tasks saveTask(Tasks task);
    Tasks findTaskById(Integer id);
    Tasks updateTask(Tasks task);
    void deleteTaskById(Integer id);
}
