package com.fatcat.auth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello, Welcome to home page";
	}
	
	@GetMapping("/profile")
	public Principal restrictedAPI(Principal principal) {
		return principal;
	}
}
