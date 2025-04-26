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

    public void login(String username, String password) {
        if (!"admin".equals(username)) {
            // ✅ This will be marked as a "Security Hotspot"
            throw new RuntimeException("User '" + username + "' not found");
        }

        if (!"secret".equals(password)) {
            throw new RuntimeException("Incorrect password");
        }
    }
}



	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


