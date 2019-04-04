package com.swapi.clinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

 
@SpringBootApplication
@EnableJpaAuditing
public class SwapiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapiClientApplication.class, args);
	}

}
