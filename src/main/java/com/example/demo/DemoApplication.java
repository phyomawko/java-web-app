package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public String authenticate(String username, String password) {
  // ....
  MyUserDetailsService s1 = new MyUserDetailsService();
  MyUserPrincipal u1 = s1.loadUserByUsername(username);

  if(u1 == null) {
    throw new BadCredentialsException(username+" doesn't exist in our database"); // Sensitive
  }
  // ....
}


	@RequestMapping("/")
  public String home() {
    return "Hello Docker World!";
  }
}


