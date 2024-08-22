package com.example.demo.service;

import com.example.demo.model.Admin;
import com.example.demo.model.User;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    public String signupAdmin(Admin admin) {
        if (adminRepository.findByName(admin.getName()) != null) {
            return "Admin already exists";
        }
        adminRepository.save(admin);
        return "Signup successful";
    }

    public String signupUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "User already exists";
        }
        userRepository.save(user);
        return "Signup successful";
    }

    public String loginAdmin(String name, String password) {
        Admin admin = adminRepository.findByName(name);
        if (admin != null && admin.getPassword().equals(password)) {
            return "Login successful";
        }
        return "Invalid credentials";
    }

    public String loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return "Login successful";
        }
        return "Invalid credentials";
    }
}
