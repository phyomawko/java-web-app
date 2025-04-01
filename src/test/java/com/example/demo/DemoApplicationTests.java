package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	public class CommandInjection {
    public static void main(String[] args) throws IOException {
        String userInput = "rm -rf /"; // Simulating an attacker’s input
        Runtime.getRuntime().exec("sh -c " + userInput); // Command injection
    }
}

}
