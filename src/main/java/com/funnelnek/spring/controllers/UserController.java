package com.funnelnek.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.entities.User;
import com.funnelnek.spring.repositories.UserRepository;


@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserRepository users;

    

    public UserController(UserRepository users) {
        this.users = users;
    }

    @GetMapping("")
    public Iterable<User> allUsers() {
        return users.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findId(@PathVariable("id") Integer id) {
        return users.findById(id);
    }
}
