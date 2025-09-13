/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasks.Task.controller;

import com.tasks.Task.model.Task;
import com.tasks.Task.service.TaskService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;
    
    @PostMapping("/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping("/user/{userId}")
    public List<Task> getTasksByUser(@PathVariable Long userId) {
        return taskService.getTasksByUserId(userId);
    }

    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/update")
    public Task updateTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted";
    }
    
}
