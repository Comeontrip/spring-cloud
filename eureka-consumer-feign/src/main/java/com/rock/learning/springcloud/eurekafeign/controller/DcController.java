package com.rock.learning.springcloud.eurekafeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rock.learning.springcloud.eurekafeign.Service.DcClient;

@RestController
public class DcController {
	
	@Autowired
	DcClient dcClient;
	
	@GetMapping("/consumer")
	public String dc() {
		return dcClient.consumer();
	}
	
	@GetMapping("/hello")
	public String hello() {
		return dcClient.hello();
	}
}
