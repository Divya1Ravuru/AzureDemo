package com.example.AzureDivya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDivyaApplication {
	
	@GetMapping("/hello")
	public String message() {
		return " First Azure Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureDivyaApplication.class, args);
	}

}
