package com.genius.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloWord {

	@GetMapping("/hello")
	public String msg() {
		return "Hello Word";
	}
	
}
