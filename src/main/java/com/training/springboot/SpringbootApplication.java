package com.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {
	//-Dspring.profiles.active=ducat
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
