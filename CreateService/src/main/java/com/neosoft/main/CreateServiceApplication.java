package com.neosoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CreateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateServiceApplication.class, args);
	}

}
