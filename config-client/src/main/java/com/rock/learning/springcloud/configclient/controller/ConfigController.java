package com.rock.learning.springcloud.configclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@RequestMapping("/hello")
	public String helloConfig() {
		return "Hello Configure Client";
	}

}
