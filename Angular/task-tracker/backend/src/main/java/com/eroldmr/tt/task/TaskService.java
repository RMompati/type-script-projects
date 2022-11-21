package com.eroldmr.tt.task;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task findTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElseThrow(
                () -> new IllegalStateException("Task with id (" + taskId + ") not found.")
        );
    }

    public void deleteTaskById(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.saveAndFlush(task);
    }
}
