package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@Valid @RequestBody UserDTO userDTO) {
        User user = new User();
        user.setId(System.currentTimeMillis()); // temp id
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        userService.addUser(user);

        return user;
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "USER DELETED SUCCESSFULLY";
    }
}
