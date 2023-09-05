package com.test.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {
	
	@GetMapping(value = "/get/{a}")
	public String getValue(@PathVariable String a) {
		return a;
	}
	@GetMapping(value ="/gets")
	public String getValues() {
		return "John";
	}
	
	

}
