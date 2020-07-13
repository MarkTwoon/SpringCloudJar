package com.chinasoft.springcloud_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
/*启动zull路由*/
@EnableZuulProxy
/*@EnableEurekaClient*/
public class ZullApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SpringApplication.run(ZullApplication.class, args);
	}

}
