package com.javafsd.Swaggerdemo.config;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

   @Bean
   public Docket api() {
       return new Docket(DocumentationType.SWAGGER_2)
           .select()
           .apis(RequestHandlerSelectors.basePackage("com.javafsd.swaggerdemo"))
           .paths(PathSelectors.any())
           .build()
           .directModelSubstitute(LocalDate.class, java.sql.Date.class)
           .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
           .apiInfo(apiInfo());
   }

   private ApiInfo apiInfo() {
       return new ApiInfoBuilder()
           .title("Javafsd - Spring Boot Swagger Configuration Demo")
           .description("We are checking Swagger configuration for application")
           .version("1.1.0")
           .contact(new Contact("Sreevidhya", null, "sreevidhyagandham46199@gmail.com"))
           .build();
   }


}