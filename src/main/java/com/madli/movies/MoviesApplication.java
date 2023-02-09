package com.madli.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController - lets API know it is a REST API controller not another class
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

/*	@GetMapping("/root")
	public String apiRoot(){
		return "Hello world!";
	}*/

}
