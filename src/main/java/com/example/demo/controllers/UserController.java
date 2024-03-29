package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/")
	public String index() {
		return "users/index";
	}

	@GetMapping("/login")
	public String login() {
		return "users/login";
	}

}
