package com.yurist.springsecuritybasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({
		@ComponentScan("com.yurist.controller"),
		@ComponentScan("com.yurist.config")})
public class SpringsecuritybasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritybasicsApplication.class, args);
	}

}
