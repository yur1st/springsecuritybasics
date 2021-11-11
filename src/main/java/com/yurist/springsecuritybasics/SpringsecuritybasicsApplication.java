package com.yurist.springsecuritybasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({
		@ComponentScan("com.yurist.controller"),
		@ComponentScan("com.yurist.config")})
@EnableJpaRepositories("com.yurist.repository")
@EntityScan("com.yurist.model")
public class SpringsecuritybasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritybasicsApplication.class, args);
	}

}
