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
	

public static void main(String[] args) throws Exception {
        String userInput = "admin' OR '1'='1"; // Dangerous input
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'"); // SQL Injection
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }

public void generateSessionId() {
Random random = new Random(); // Security Hotspot: Not cryptographically secure
int sessionId = random.nextInt();
    }
public class RegexDoSExample {
    public void vulnerableRegex(String input) {
        // Security Hotspot: Potential for ReDoS (Regular Expression Denial of Service)
        input.replaceAll("(a+)+", "b");
    }
}






	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


