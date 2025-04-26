package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;
import java.util.Random;
import javax.servlet.http.Cookie;
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
public class CookieExample {
    public void addCookie(javax.servlet.http.HttpServletResponse response) {
        Cookie cookie = new Cookie("user", "value");
        // Security Hotspot: Cookie should have 'secure' flag set
        response.addCookie(cookie);
    }
}






	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


