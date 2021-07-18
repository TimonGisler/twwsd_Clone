package com.timongisler.twwsd_Clone.twwsd_Clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TwwsdCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwwsdCloneApplication.class, args);
	}
	
	@GetMapping
	public String Hello() {
		return "Hello WOrld.";
	}

}
