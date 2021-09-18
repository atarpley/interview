package com.example.interview.controller;

import com.example.interview.model.UserWithPassword;
import com.example.interview.model.UserWithoutPassword;
import com.example.interview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    // Example: http://localhost:8080/api/users/user1
    public UserWithoutPassword findByUsername(@PathVariable String username) {
        // TODO:
        // - Implement Happy Path (return data with a 200 OK)
        // - Implement Error Path (Return 404 if user not found)
        return new UserWithoutPassword("username", "first", "last");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserWithoutPassword create(@RequestBody UserWithPassword userWithPassword) {
        // Business Rule:
        // Password must be exactly 8 characters long

        // TODO:
        // - Implement Happy Path, enforcing business rule (return data with a 200 OK)
        // - Implement Error Path (Return 409 if username already exists)
        return new UserWithoutPassword("username", "first", "last");
    }
}