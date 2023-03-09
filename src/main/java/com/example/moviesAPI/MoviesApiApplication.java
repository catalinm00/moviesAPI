package com.example.moviesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class MoviesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApiApplication.class, args);
	}

}
