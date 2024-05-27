package com.database.springboot_database_k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDatabaseK8sApplication {


	@GetMapping
	public String helloWorld() {
		return "Hi THis is Prakash with update";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatabaseK8sApplication.class, args);
	}

}
