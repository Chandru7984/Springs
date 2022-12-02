package com.xworkz.mass.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mass.bean.Ambulance;
import com.xworkz.mass.bean.Brand;
import com.xworkz.mass.bean.Hospital;
import com.xworkz.mass.bean.Mrp;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	
	public SpringConfig() {
		System.out.println("create configuration using default const...");
	}
	
	@Bean
	public Mrp mrp() {
		Mrp mrp = new Mrp("Venka");
		return mrp;
	}
	
	@Bean
	public double closingTime() {
		return 12.30;
	}
	
	@Bean
	public Brand brand() {
		Brand brand = new Brand("Old monk", 250);
		return brand;
	}
	
	@Bean
	public double manufactureYear() {
		return 2022;
	}
	
	@Bean
	public double quantity() {
		return 180.0;
	}
	
	@Bean
	public String type() {
		return "Rum";
	}
	
	@Bean
	public Hospital hospital() {
		Hospital hospital = new Hospital("Bapuji");
		return hospital;
	}
	
	@Bean
	public Ambulance ambulance() {
		Ambulance ambulance = new Ambulance("Private", "TT");
		return ambulance;
	}
	
	@Bean
	public boolean patient() {
		return true;
	}
	
	@Bean
	public boolean syren() {
		return true;
	}
	
	
	
	
	

}
