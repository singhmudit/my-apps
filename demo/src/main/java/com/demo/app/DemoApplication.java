package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//test app
		System.out.println("Code Check-in from my phone for Jenkins Webhook");
		SpringApplication.run(DemoApplication.class, args);
	}
}
