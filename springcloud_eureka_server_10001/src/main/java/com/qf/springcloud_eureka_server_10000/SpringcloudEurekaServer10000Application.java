package com.qf.springcloud_eureka_server_10000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServer10000Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServer10000Application.class, args);
	}

}

