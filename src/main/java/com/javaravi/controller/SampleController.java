package com.javaravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/springdemo")
public class SampleController {	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome To Spring Boot :";
	}

}
