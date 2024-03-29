package com.niveus.springcicddemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	

	@Autowired
	private MessageService messageService;
	
	@Autowired
    RestTemplate restTemplate;
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam String user) {
		return messageService.getSubscriptionMessage(user);
	}

	@GetMapping("/version")
	public String getVersion() {
		return "ISTIO - Version 1.0";
	}

	@GetMapping("/version2")
	public String getVersion2() {
		return "ISTIO - Version 2.0";
	}

	@GetMapping("/version3")
	public String getVersion3() {
		return "ISTIO - Version 3.0";
	}
	
	@GetMapping("/greeting")
	public String doGreeting(@RequestParam String user) {
		
		if(user.equalsIgnoreCase("mohsin")){ 
			return restTemplate.getForObject("http://springgreeting.default.svc.cluster.local:9090/api/greeting/hello?user=Mohsin", String.class);
		}
		else {
			return restTemplate.getForObject("http://springgreeting.default.svc.cluster.local:9090/api/greeting/exception/arithmetic", String.class);
		}
		
	}
	

}
