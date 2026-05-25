package com.airtibe.java.payFlow.controller;

import com.airtibe.java.payFlow.entity.User;
import com.airtibe.java.payFlow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService _userService;

    @PostMapping
    public User registerUser( @RequestBody User user){
        return _userService.registerUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return _userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return _userService.getUserById(id);
    }

//    @GetMapping
//    public User findByUpiId(String upiId){
//        return _userService.findByUpiId(upiId);
//    }
}
