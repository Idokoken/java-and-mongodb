package com.ndgroups.springmongodb.controller;

import com.ndgroups.springmongodb.model.User;
import com.ndgroups.springmongodb.service.IUserService;
import com.ndgroups.springmongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private IUserService userService;


    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return new ResponseEntity<Void>( HttpStatus.CREATED);
    }
}
