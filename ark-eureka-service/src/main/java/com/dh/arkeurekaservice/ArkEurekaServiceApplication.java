package com.dh.arkeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ArkEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArkEurekaServiceApplication.class, args);
	}

}
