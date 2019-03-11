package com.rock.learning.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/dc")
	public String dc() throws InterruptedException {
		Thread.sleep(5000L);
		String services = "services:" + discoveryClient.getServices();
		System.out.println(services);
		return services;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello, Spring Cloud.";
	}
	
	@RequestMapping("/")
	public String defaultPage() {
		return "why cannot access?";
		
	}
	
	@RequestMapping("/username/{id}")
	public String getUserName(@PathVariable Long id) {
		return "";
	}

}
