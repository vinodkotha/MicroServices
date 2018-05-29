package com.vk.micrservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.micrservices.limitsservice.bean.Configuration;
import com.vk.micrservices.limitsservice.bean.LimitServiceConfig;

@RestController
public class LimitConfigController {
	
	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public LimitServiceConfig getLimitConfig() {
		return new LimitServiceConfig(config.getMin(),config.getMax());
	}
}
