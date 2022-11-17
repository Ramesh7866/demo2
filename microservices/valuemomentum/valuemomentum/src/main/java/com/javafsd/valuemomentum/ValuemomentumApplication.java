package com.javafsd.valuemomentum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ValuemomentumApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValuemomentumApplication.class, args);
    }

    @GetMapping("/hello")
    public String helloWorld() {

        return "Hello Spring boot!";
    }

}