package com.qf.springcloud_provider_8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
public class SpringcloudProvider8080Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudProvider8080Application.class, args);
	}

}

