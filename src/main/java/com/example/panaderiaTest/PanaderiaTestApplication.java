package com.example.panaderiaTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class PanaderiaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanaderiaTestApplication.class, args);
	}

}
