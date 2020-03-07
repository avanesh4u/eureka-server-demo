package com.sharma.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // Enable eureka server
@SpringBootApplication
public class EureksServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureksServerApplication.class, args);
	}

}
