package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	public class SQLInjection {
    public static void main(String[] args) throws Exception {
        String userInput = "admin' OR '1'='1"; // Dangerous input
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + userInput + "'"); // SQL Injection
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }
}

}
