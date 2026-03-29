package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    public User findUserById(Long id) {
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                return user;
            }
        }
        return null;
    }

    public void deleteUserById(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
