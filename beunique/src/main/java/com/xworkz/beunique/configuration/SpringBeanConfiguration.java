package com.xworkz.beunique.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringBeanConfiguration {
	
	public SpringBeanConfiguration() {
		System.out.println("create config using default const...");
	}

}
