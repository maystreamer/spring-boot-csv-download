package com.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.sample.app"})
@ComponentScan({"com.sample.app"})
@EnableConfigurationProperties
@EnableAutoConfiguration
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] { AppStarter.class }, args);
	}
}