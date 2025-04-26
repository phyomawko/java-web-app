package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public class ShellExecutor {

    public void runCommand(String userInput) throws Exception {
        // Security Hotspot: user input directly used in command
        Runtime.getRuntime().exec("ping " + userInput);
    }
}




	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


