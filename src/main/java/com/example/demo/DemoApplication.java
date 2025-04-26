package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;
import java.util.Random;
@SpringBootApplication
@RestController
public class DemoApplication {
	
private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

   public void logCredentials(String username, String password) {
    System.out.println("User " + username + " entered password: " + password);
}
public void runCommand(String cmd) throws Exception {
    Runtime.getRuntime().exec("ping " + cmd); // 🔥 Hotspot
}
public void generateSessionId() {
Random random = new Random(); // Security Hotspot: Not cryptographically secure
int sessionId = random.nextInt();
    }





	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


