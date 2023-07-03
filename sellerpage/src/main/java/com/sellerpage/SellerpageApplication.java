package com.sellerpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SellerpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerpageApplication.class, args);
		System.out.println("Seller page Started");
	}
	
	@Bean
	protected RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
