package com.qf.springcloud_gateway_16000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGateway16000Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudGateway16000Application.class, args);
	}

}

