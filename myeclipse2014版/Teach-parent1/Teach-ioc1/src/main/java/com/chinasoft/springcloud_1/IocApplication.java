package com.chinasoft.springcloud_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.chinasoft.springcloud_1.service")
public class IocApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(IocApplication.class, args);
	}
 
 
}
