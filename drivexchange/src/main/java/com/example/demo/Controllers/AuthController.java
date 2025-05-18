package com.example.demo.Controllers;

//Ok We are doing something here

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Role;
import com.example.demo.Model.User;
import com.example.demo.Services.IRoleService;
import com.example.demo.Services.IUserService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

// REMOVE THIS METHOD
//    @PostMapping("/register")
//    public User register(@RequestBody User user) {
//        Role role = roleService.getRoleByName(user.getRole().getRoleName());
//        user.setRole(role);
//        return userService.registerUser(user);
//    }

    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email).orElse(null);
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public User register1(@RequestBody User user) {
        Role role = roleService.getRoleByName(user.getRole().getRoleName());
        user.setRole(role);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.registerUser(user);
    }
}