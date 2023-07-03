package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class PaymentpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentpageApplication.class, args);
		System.out.println("Payment service Started");
	}
	
	@Bean
	protected RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
