package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User signup(User user) {
        // Implement your signup logic here
        return userRepository.save(user);
    }

    public Optional<User> findByNameAndDamName(String name, String damName) {
        return userRepository.findByNameAndDamName(name, damName);
    }
}
