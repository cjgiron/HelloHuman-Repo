package com.codingdojo.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, @RequestParam(value="last_name", required=false) String last_name) {
		if(name == null) {
			return "<h1>Hello Human!</h1> <p>Welcome to SpringBoot!</p>";
		} else {
			return "<h1>Hello " + name + " " + last_name + "!</h1> <p>Welcome to SpringBoot!</p>"
					+ "<a href='/'>Go Back</a>";
		}
	}
}
