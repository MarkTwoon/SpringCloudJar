package com.chinasoft.springcloud_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/*@EnableEurekaServer 虚拟注解配置 以注册中心形式启动*/
@EnableEurekaServer
public class EurakeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		 
  SpringApplication.run(EurakeApplication.class, args);
	}
	 	
}
