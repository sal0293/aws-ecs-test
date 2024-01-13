package com.salman.ecs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsEcsController {

	@GetMapping("/hello")
	public String getData() {
		
		return "AWS ECS Appicaiton is live...Congrats Salman";
	}
}
