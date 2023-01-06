package com.niveus.springcicddemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

	@Autowired
	private MessageService messageService;

	@GetMapping("/hello")
	public String sayHello(@RequestParam String user) {
		return messageService.getSubscriptionMessage(user);
	}

	@GetMapping("/version")
	public String getVersion() {
		return "Version 1.0";
	}

	@GetMapping("/version2")
	public String getVersion2() {
		return "Version 2.0";
	}

	@GetMapping("/version3")
	public String getVersion3() {
		return "Version 3.0";
	}

}
