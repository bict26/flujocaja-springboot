package com.flujocaja.tdsc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })

public class FlujocajaSprintbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlujocajaSprintbootApplication.class, args);
	}

}
