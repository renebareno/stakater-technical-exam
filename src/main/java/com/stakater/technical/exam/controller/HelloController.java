package com.stakater.technical.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
    @GetMapping(value = "/greeting/{name}")
    public String greeting(@PathVariable String name) {
    	name = (name != null && !name.trim().isEmpty())?name:"stranger";
        return "Hello ".concat(name);
    }	
    @GetMapping(value = "/greeting")
    public String greetingDefault() {
        return "Hello stranger";
    }

}
