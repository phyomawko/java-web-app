package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		String dbUser = "admin";
        	String dbPassword = "password123"; // Hardcoded password (Security issue)
       		System.out.println("Connecting to DB with user: " + dbUser);
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}
