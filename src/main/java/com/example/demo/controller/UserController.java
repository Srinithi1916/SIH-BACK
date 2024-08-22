package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User signupRequest) {
        try {
            User newUser = userService.signup(signupRequest);
            if (newUser != null) {
                return ResponseEntity.ok("Signup successful");
            } else {
                return ResponseEntity.status(400).body("Signup failed");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An error occurred: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User loginRequest) {
        Optional<User> existingUser = userService.findByNameAndDamName(loginRequest.getName(), loginRequest.getDamName());

        if (existingUser.isPresent() && existingUser.get().getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else if (!existingUser.isPresent()) {
            return ResponseEntity.status(401).body("You need to signup first");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
