package com.LearnSpringBoot.RestAPI.controllers;

import com.LearnSpringBoot.RestAPI.DTO.LoginForm;
import com.LearnSpringBoot.RestAPI.DTO.ResponseObject;
import com.LearnSpringBoot.RestAPI.model.User;
import com.LearnSpringBoot.RestAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<ResponseObject> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                new ResponseObject("ok", "Query created successfully", userService.createUser(user))
        );
    }
    @PostMapping("/login")
    public ResponseEntity<ResponseObject> login(@RequestBody LoginForm user) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok", "Login successfully", userService.login(user.getUsername(),user.getPassword()))
        );
    }
    @GetMapping("")
    public ResponseEntity<ResponseObject> getAllUsers() {
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok", "Query all users successfully", userService.getAllUsers())
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseObject> getUser(@PathVariable Long id) {
        System.out.println(userService.getUser(id));
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok", "Query find user successfully", userService.getUser(id).isPresent() ? userService.getUser(id) : "")
        );
    }
    @PostMapping("api/checkPhone")
    public String checkPhone(@RequestBody String phone){
        System.out.println(phone);
        return "00";
    }
}
