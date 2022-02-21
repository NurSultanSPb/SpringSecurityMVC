package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void save(User person);
    void update(int id, User updatedPerson);
    void delete(int id);
    boolean saveUser(User user);
    User findUserByUsername(String username);
}
