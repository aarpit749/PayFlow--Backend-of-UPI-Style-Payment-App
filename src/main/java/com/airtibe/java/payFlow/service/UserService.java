package com.airtibe.java.payFlow.service;

import com.airtibe.java.payFlow.entity.User;
import com.airtibe.java.payFlow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository _userRepository;

    /*
     * What Spring does at startup:
     * Spring Boot scans the classpath, finds @Service and @Repository classes,
     * creates their objects as "beans" inside the ApplicationContext, and then
     * performs dependency injection. Here, it automatically injects the
     * UserRepository bean into this UserService field.
     */

    public User registerUser(User user){
        return _userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return _userRepository.findAll();
    }

    public User getUserById(Long id) {
        return _userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public User findByUpiId(String upiId){
        return _userRepository.findByUpiId(upiId).orElseThrow(() -> new RuntimeException("User not found with UPI id: " + upiId));
    }

    public List<User> getUsersWithBalanceGreaterThan(Double minBalance) {
        return _userRepository.findUsersWithBalanceGreaterThan(minBalance);
    }
}
