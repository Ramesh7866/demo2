package com.javafsd.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javafsd.userservice.entity.User;
import com.javafsd.userservice.repository.UserRepository;
import com.javafsd.userservice.service.Impl.UserService;
import com.javafsd.userservice.vo.DepartmentView;
import com.javafsd.userservice.vo.ResponseTemplateView;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        User userResp = userRepository.save(user);
        return userResp;
    }

    @Override
    public ResponseTemplateView getUserbyId(Long userId) {
        //fetch user details from database based on user id 
        User userRespFromDB = userRepository.findById(userId).get();

        //Connecting to Department microservice using RestTemplate
        //fetch department details from department microservice using department id present in userRespFromDB as above.
        DepartmentView departmentView = restTemplate
                .getForObject("http://localhost:8080/departments/"+ userRespFromDB.getDepartmentId(), DepartmentView.class);

        //Create object of ResponseTemplateView
        ResponseTemplateView responseTemplateView = new ResponseTemplateView();

        //set user details in ResponseTemplateView
        responseTemplateView.setUser(userRespFromDB);

        //set department details in ResponseTemplateView
        responseTemplateView.setDepartmentView(departmentView);

        return responseTemplateView;
    }

    
}