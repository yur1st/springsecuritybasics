package com.yurist.springsecuritybasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.yurist.controller")
public class SpringsecuritybasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritybasicsApplication.class, args);
	}

}
