package com.training.app.controller;

import com.training.app.model.User;
import com.training.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public User registration(@RequestBody User user) {
        userService.save(user);
        user.setPassword(null);
        return user;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public User welcome() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = auth.getName();
        User user = new User();
        user.setUsername(currentUserName);
        return user;
    }
}
