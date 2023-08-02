package com.example.todo_java.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://localhost:5173")
@RestController
public class TodoApplicationController {
    
    @GetMapping("/")
    public String fetchTodo() {
        return "hello world";
    }
}
