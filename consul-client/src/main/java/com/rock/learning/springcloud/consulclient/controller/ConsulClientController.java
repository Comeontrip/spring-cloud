package com.rock.learning.springcloud.consulclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulClientController {

	@Autowired
	private DiscoveryClient discorveryClient;

	@RequestMapping("/consul")
	public String consulServices() {
		String services = "Services:" + discorveryClient.getServices();
		System.out.println(services);
		return services;
	}

	@RequestMapping("/welcome")
	public String welcomeToConsul() {
		return "Welcome to Consul";
	}

}
