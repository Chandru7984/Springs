package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {

	@Autowired
	private String owner;
	@Autowired
	private double homeRent;
	@Autowired
	private HomeRules homeRules;
	
	public Home() {
		System.out.println("create Home using default const...");
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getHomeRent() {
		return homeRent;
	}
	
	public void detailsHomeRules() {
		System.out.println(homeRules.getTenent());
		System.out.println(homeRules.getWaterBill());
	}
}
