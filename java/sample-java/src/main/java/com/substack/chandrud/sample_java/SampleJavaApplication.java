package com.substack.chandrud.sample_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJavaApplication.class, args);
	}

	@GetMapping("/hi")
	public String sayHi() {
		return "Hi! I am running in Amazon ECS";
	}

}
