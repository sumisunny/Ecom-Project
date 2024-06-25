package com.example.Ecom.Projects.controller;

import com.example.Ecom.Projects.model.User;
import com.example.Ecom.Projects.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newuser(@RequestBody User newUser){
        return userRepository.save(newUser);

    }
@GetMapping("/users")
List<User> getAllUsers(){
  return userRepository.findAll();
}
}
