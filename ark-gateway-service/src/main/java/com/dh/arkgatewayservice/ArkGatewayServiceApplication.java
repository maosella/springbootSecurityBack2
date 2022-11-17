package com.dh.arkgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ArkGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArkGatewayServiceApplication.class, args);
	}

}
