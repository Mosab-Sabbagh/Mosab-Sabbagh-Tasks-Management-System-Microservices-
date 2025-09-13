/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.auth.auth.controller;

import java.util.Optional;
import com.auth.auth.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.auth.auth.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }
    
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        Optional<User> authUser = authService.login(user.getUsername(), user.getPassword());
        return authUser.isPresent() ? "Login successful" : "Invalid credentials";
    }
}
