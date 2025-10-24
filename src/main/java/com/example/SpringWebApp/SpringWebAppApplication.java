package com.example.SpringWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebAppApplication {
@GetMapping("/cse")
public String cse() {
	return "Welcome to CSE Department";
}
	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}

}
