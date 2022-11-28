package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeRules {
	
	@Autowired
	private String tenent;
	@Autowired
	private double waterBill;

	public HomeRules() {
		System.out.println("create homerules default const...");
	}
	
	public String getTenent() {
		return tenent;
	}
	
	public double getWaterBill() {
		return waterBill;
	}
	
}
