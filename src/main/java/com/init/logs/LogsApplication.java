package com.init.logs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogsApplication {

	@GetMapping("/message")
	public String message(){
		return  "Dockerize java app";
	}

	public static void main(String[] args) {
		SpringApplication.run(LogsApplication.class, args);
	}

}
