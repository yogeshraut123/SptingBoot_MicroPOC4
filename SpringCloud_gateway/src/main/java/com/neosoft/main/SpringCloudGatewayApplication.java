package com.neosoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudGatewayApplication {

	public static void main(String[] args) {
		System.out.println("Spring cloud gateway Start");
		SpringApplication.run(SpringCloudGatewayApplication.class, args);
	}

}
