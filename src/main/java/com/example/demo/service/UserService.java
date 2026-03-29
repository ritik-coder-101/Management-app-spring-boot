package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteUserById(id);
    }
}
