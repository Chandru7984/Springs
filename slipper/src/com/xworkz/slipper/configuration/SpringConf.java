package com.xworkz.slipper.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.slipper.bean.Slipper;

@Configuration
public class SpringConf {
	
	public SpringConf() {
		System.out.println("Configuration const...");
	}

	@Bean
	public Slipper slipper() {
		Slipper slip = new Slipper();
		return slip;
	}
}
