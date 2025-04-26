package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Bean(name = "multipartResolver")
public CommonsMultipartResolver multipartResolver() {
  CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
  multipartResolver.setMaxUploadSize(104857600); // Sensitive (100MB)
  return multipartResolver;
}

@Bean(name = "multipartResolver")
public CommonsMultipartResolver multipartResolver() {
  CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(); // Sensitive, by default if maxUploadSize property is not defined, there is no limit and thus it's insecure
  return multipartResolver;
}

@Bean
public MultipartConfigElement multipartConfigElement() {
  MultipartConfigFactory factory = new MultipartConfigFactory(); // Sensitive, no limit by default
  return factory.createMultipartConfig();
}


	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


