package com.jibeesh.springoauth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class SpringOauth2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2DemoApplication.class, args);
	}

}
