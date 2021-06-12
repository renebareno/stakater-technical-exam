package com.stakater.technical.exam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${NAME:stranger}")
	private String name;

	@GetMapping(value = "/greeting")
	public String greetingDefault() {
		
		return "Hello " + name;
	}

}
