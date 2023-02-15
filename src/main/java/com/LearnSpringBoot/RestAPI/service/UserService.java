package com.LearnSpringBoot.RestAPI.service;

import com.LearnSpringBoot.RestAPI.model.User;
import com.LearnSpringBoot.RestAPI.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }
    public User login(String username,String password){
        return userRepository.findByUsernameAndPassword(username,password);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public Optional<User> getUser(long id){
        return userRepository.findById(id);
    }
}
