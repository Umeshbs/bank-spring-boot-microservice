package com.micro.springbootdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
//@ComponentScan(basePackages = "com.micro")
public class SpringbootdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdataApplication.class, args);
	}

}
