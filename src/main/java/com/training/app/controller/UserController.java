package com.training.app.controller;

import com.training.app.model.User;
import com.training.app.service.SecurityService;
import com.training.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public User registration(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public User registrationTest() {
        return new User();
    }

   /* @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }*/
/*

   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login(User user){
       securityService.autoLogin(user.getUsername(),user.getPassword());
       return "login";
   }*/


    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }
}
