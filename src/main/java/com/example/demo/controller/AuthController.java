package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.model.User;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        if ("Admin".equals(request.getUserType())) {
            Admin admin = new Admin();
            admin.setName(request.getName());
            admin.setDamName(request.getDamName());
            admin.setState(request.getState());
            admin.setGovtId(request.getGovtId());
            admin.setPassword(request.getPassword());
            return authService.signupAdmin(admin);
        } else {
            User user = new User();
            user.setName(request.getName());
            user.setEmail(request.getEmail());
            user.setPhoneNumber(request.getPhoneNumber());
            user.setPassword(request.getPassword());
            return authService.signupUser(user);
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        if ("Admin".equals(request.getUserType())) {
            return authService.loginAdmin(request.getName(), request.getPassword());
        } else {
            return authService.loginUser(request.getEmail(), request.getPassword());
        }
    }
}
