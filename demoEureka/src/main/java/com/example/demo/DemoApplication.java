package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableEurekaServer
@SpringBootApplication
//@RestController
public class DemoApplication {

	/*@Autowired
	private RestTemplate restTemplate;*/

	public static void main(String[] args) {
		//SpringApplication app = new SpringApplication(DemoApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);// 关闭启动Banner
		//app.setBannerMode(Banner.Mode.CONSOLE);// 输出Banner到控制台
		//app.setBannerMode(Banner.Mode.LOG);// 输出Banner到日志中
		//app.run(args);
		//SpringApplication.run(DemoApplication.class, args);
		//this.restTemplate.getForObject()

		new SpringApplicationBuilder().sources(DemoApplication.class)
									.run(args);
	}
}
