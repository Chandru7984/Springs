package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	
	@Autowired
	private double shopRent;
	@Autowired
	private String ownerName;
	@Autowired
	private Tv tv;
	
	public Saloon() {
		System.out.println("Created Saloon using default const...");
	}
	
	public double getShopRent() {
		return shopRent;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void displayTvDetails() {
		System.out.println(tv.getBrand());
		System.out.println(tv.getOwnerName());
	}
}
