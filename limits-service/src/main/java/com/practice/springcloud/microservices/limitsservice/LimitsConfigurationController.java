package com.practice.springcloud.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retieveLimitsforConfiguration() {
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
