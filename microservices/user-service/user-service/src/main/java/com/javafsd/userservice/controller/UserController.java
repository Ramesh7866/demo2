package com.javafsd.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;        
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.service.Impl.UserService;
import com.javafsd.userservice.vo.ResponseTemplateView;

@RestController
@RequestMapping("/users")
public class UserController 
{
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user)
    {        
    User userResp=userService.saveUser(user);
      return userResp;    
    }

    @GetMapping("/{id}")
    public ResponseTemplateView getUserbyId(@PathVariable("id") Long userId)
    {
        ResponseTemplateView userResp=userService.getUserbyId(userId);
        return userResp;
    }
}
