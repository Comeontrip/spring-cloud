package com.rock.learning.springcloud.apigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.rock.learning.springcloud.apigatewayzuul.filter.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayZuulApplication {

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayZuulApplication.class, args);
	}
}
