package com.accenture.spring.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDemoController {

	@RequestMapping("/")
	public String index(){
		return "Greeting from Spring Boot!";
	}
}
