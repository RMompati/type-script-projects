package com.eroldmr.tt.api;

import com.eroldmr.tt.task.Task;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import com.eroldmr.tt.task.TaskService;

import java.util.List;

@RestController
@RequestMapping("api/v1/tasks")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class TaskTrackerApi {

    private final TaskService taskService;

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping
    public void saveTask(@RequestBody Task task) {
        taskService.updateTask(task);
    }

    @PutMapping(value = "/update/{id}")
    public void updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTaskById(@PathVariable("id") Long taskId) {
        taskService.deleteTaskById(taskId);
    }
}
