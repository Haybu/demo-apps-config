package io.agilehandy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class ServiceAMain {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAMain.class, args);
	}
}