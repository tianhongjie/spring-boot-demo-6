package com.cdemo.demo06.controller;

import com.cdemo.demo06.entity.User;
import com.cdemo.demo06.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charlie Tian
 * @date 11/7/18
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @GetMapping("/user")
    public User getUser(User user) {
        userRepository.save(user);
        return user;
    }
}
