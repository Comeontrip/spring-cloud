package com.rock.learning.springcloud.eurekafeign.Service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcClient {

	@GetMapping("/dc")
	public String consumer();
	
	@GetMapping("/hello")
	public String hello();
	
	
}
