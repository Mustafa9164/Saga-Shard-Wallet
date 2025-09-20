package com.example.shardedsagawallet.controller;

import com.example.shardedsagawallet.entity.User;
import com.example.shardedsagawallet.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/users")
public class UsrController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.createUser(user);
        return  ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        User userById = userService.getUserById(id);
        return ResponseEntity.ok(userById);
    }

    @GetMapping("/name")
    public ResponseEntity<List<User>> getUserByName(@RequestParam String name){
        List<User> userByName = userService.getUserByName(name);
        return ResponseEntity.ok(userByName);
    }
}
