package com.flujocaja.tdsc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.flujocaja.tdsc.app.repository.SaldoInicialRepository;

//import com.flujocaja.tdsc.app.repository.ColaboradorRepository;


//@EnableJpaRepositories(basePackageClasses = SaldoInicialRepository.class)
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class FlujocajaSprintbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlujocajaSprintbootApplication.class, args);
	}

}
