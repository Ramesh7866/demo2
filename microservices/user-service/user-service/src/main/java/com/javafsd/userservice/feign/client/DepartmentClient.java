package com.javafsd.userservice.feign.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.javafsd.userservice.vo.DepartmentView;


@FeignClient(name="DEPARTMENT-SERVICE")
public interface DepartmentClient {

    @GetMapping("/departments/")
    public List<DepartmentView> findDepartments();
}
