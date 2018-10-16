package com.thiagodev.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int maxmum;
	private int minimum;
	
	public int getMaxmum() {
		return maxmum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMaximum(int maximum) {
		this.maxmum = maximum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
