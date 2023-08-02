package com.example.todo_java.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class TodoApplicationController {
    
    @GetMapping("/")
    public List fetchTodo() {
        List<Map<String, String>> todos = new ArrayList<>();

        Map<String, String> todo1 = new HashMap<>();
        todo1.put("id1", "task1");
        todos.add(todo1);
        return todos;
    }

    @PostMapping("/add")
    public Map addTodo() {
        Map<String, String> todo = new HashMap<>();

        todo.put("id10", "task10");

        return todo;
    }

}
