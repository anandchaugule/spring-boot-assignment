package com.syne.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootRestAppApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootRestAppApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Running app with logging ...");
		SpringApplication.run(SpringbootRestAppApplication.class, args);
	}

}

