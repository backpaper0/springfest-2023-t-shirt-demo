package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringFest {

	@GetMapping("/springfest")
	public String spring() {
		return "Spring Fest 2023!";
	}
}
