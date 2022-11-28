package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Metro {

	@Autowired
	private String corporation;
	@Autowired
	private double noOfRoutes;
	
	public Metro() {
		System.out.println("create metro using default const...");
	}
	
	public String getCorporation() {
		return corporation;
	}
	
	public double getNoOfRoutes() {
		return noOfRoutes;
	}
}
