package com.LearnSpringBoot.RestAPI.service;

import com.LearnSpringBoot.RestAPI.model.User;
import com.LearnSpringBoot.RestAPI.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {
     User createUser(User user);
    User login(String username,String password);
    List<User> getAllUsers();
    Optional<User> getUser(long id);
}
