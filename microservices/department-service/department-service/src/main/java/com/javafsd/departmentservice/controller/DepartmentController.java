 package com.javafsd.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javafsd.departmentservice.entity.Department;
import com.javafsd.departmentservice.service.DepartmentService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {


    @Autowired
    private DepartmentService departmentServices;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        Department departmentResponse = departmentServices.saveDepartment(department);
        return departmentResponse;
    }

}