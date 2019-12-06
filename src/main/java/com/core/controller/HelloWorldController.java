package com.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String greet()
	{
		return "Hi, This is my first spring boot trying to use it with Docker!";
	}

}
