package com.qf.springcloud_consumer_ribbon_9090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringcloudConsumerRibbon9090Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerRibbon9090Application.class, args);
	}

	@Bean
	//负载均衡
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}

