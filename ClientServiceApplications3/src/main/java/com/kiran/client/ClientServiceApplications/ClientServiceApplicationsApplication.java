package com.kiran.client.ClientServiceApplications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientServiceApplicationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplicationsApplication.class, args);
	}

}
