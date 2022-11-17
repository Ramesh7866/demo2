package com.javafsd.userservice.service.Impl;

import org.springframework.stereotype.Component;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.vo.ResponseTemplateView;

@Component
public interface UserService {

    public User saveUser(User user);

    public ResponseTemplateView getUserbyId(Long userId);




}
