package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.User;

public interface IUserService {
    User registerUser(User user);
    Optional<User> findByEmail(String email);
    List<User> getAllUsers();
    User getUserById(Long id);
}