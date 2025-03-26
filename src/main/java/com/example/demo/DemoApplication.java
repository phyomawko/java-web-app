package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);

		 String userInput = "admin' OR '1'='1"; // Dangerous input
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'"); // SQL Injection
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
	}

	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}
