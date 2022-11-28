package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tv {
	
	@Autowired
	private String brand;
	@Autowired
	private String ownerName;

	public Tv() {
		System.out.println("Created Tv using default const...");
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
}
