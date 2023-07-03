package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class BuyerPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerPageApplication.class, args);
		System.out.println("Buyer page Started");
	}

	@Bean
	protected RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
