package com.spring.webSecurity.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ResourceController {

	@RequestMapping({"/admin"})
	public String adminPage() {
		return "Hello ADMIN";
	}
	
	@RequestMapping({"/user"})
	public String userPage() {
		return "Hello User";
	}
	
	@RequestMapping({"/management"})
	public String managementPage() {
		return "Hello Management";
	}
}
