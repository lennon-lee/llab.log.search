package com.llab.cronus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = { "com.llab.cronus.config", "com.llab.cronus.controller", "com.llab.cronus.service" })
@EntityScan(value = { "com.llab.cronus.entity", "com.llab.cronus.repository" })
public class CronusApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CronusApplication.class, args);
	}
}
