package com.leonardojsusfig.roleforgeapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.leonardojsusfig.roleforgeapi.DTO.UserDTO;
import com.leonardojsusfig.roleforgeapi.model.Users;
import com.leonardojsusfig.roleforgeapi.services.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping()
    public Users getUser(@RequestBody UserDTO user) {
        return userService.getUser(user);
    }

    @PostMapping()
    public void postUser(@RequestBody UserDTO user){
        userService.postUser(user);
    }

    @PutMapping()
    public void putUser(@RequestBody UserDTO user){
        userService.putUser(user);
    }
}
