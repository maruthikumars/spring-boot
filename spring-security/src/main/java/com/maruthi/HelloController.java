package com.maruthi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Welcome";
	}

	@GetMapping("/user")
	public String user() {
		return "Welcome, User!";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Welcome, Admin!";
	}

}
