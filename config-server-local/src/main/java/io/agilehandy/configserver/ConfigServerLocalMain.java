package io.agilehandy.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLocalMain {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerLocalMain.class, args);
	}
}
