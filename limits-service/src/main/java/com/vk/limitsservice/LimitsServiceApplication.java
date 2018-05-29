package com.vk.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.limitsservice.bean.Configuration;


@SpringBootApplication
public class LimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}
	
	@RefreshScope
	@RestController
	class MessageRestController {
		
		@Autowired
		private Configuration config;
	    @Value("${msg:Hello world - Config Server is not working..pelase check}")
	    private String msg;
	 
	    @RequestMapping("/msg")
	    int getMsg() {
	        return config.getMax();
	    }
	}
}
