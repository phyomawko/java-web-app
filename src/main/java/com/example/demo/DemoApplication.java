package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;
@SpringBootApplication
@RestController
public class DemoApplication {
	
private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public void logUser(String username, String password) {
        logger.info("Logging in user: " + username + " with password: " + password); // 🔥 Hotspot
    }



	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


