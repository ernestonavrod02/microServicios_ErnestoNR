package com.nttdata.pruebaSpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication

public class PruebaSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaSpringCloudApplication.class, args);
	}

}
