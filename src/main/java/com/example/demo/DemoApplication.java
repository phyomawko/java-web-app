package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public class CommandInjection {
    public static void main(String[] args) throws IOException {
        String userInput = "rm -rf /"; // Simulating an attacker’s input
        Runtime.getRuntime().exec("sh -c " + userInput); // Command injection
    }
}


	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}
