package com.stakater.technical.exam.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${NAME:stranger}")
	private String name;

	@GetMapping(value = "/greeting")
	public String greetingDefault() {
		Map<String, String> env = System.getenv();
		for (Map.Entry<String, String> entry : env.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		return "Hello " + name;
	}

}
