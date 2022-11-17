package com.dh.arkserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ArkServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArkServerConfigApplication.class, args);
	}

}
