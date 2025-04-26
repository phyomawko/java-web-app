package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public class AuthService {

  public String authenticate(String username, String password) {
    // Simulate a user lookup
    if ("admin".equals(username)) {
      // check password, etc.
      return "Authenticated";
    } else {
      // User enumeration vulnerability — disclosing valid usernames
      throw new RuntimeException("User " + username + " not found"); // Noncompliant
    }
  }
}


	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


