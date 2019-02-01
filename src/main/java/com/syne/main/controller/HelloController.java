package com.syne.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hi")
	public String getHello() {
		return new String("Hello World");		
	}
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return new String("Welcome " + name);
	}
		
}
