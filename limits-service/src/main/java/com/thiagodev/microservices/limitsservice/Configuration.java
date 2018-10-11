package com.thiagodev.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}

}
