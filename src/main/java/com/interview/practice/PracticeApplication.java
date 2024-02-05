package com.interview.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(PracticeApplication.class, args);
	}
}
