package com.piedpiper.bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookzyApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Bookzy";
	}

}
