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

		 System.out.println("Processing...");
        	System.out.println("Processing...");
        	System.out.println("Processing...");
        	System.out.println("Processing...");
        	System.out.println("Processing...");
	}

	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}
