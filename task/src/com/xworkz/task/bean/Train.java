package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Train {
	
	@Autowired
	private String govt;
	@Autowired
	private String name;
	@Autowired
	private Metro metro;
	
	public Train() {
		System.out.println("Create Train using default const...");
	}
	
	public String getGovt() {
		return govt;
	}
	
	public String getName() {
		return name;
	}
	
	public void getMetroDetails() {
		System.out.println(metro.getCorporation());
		System.out.println(metro.getNoOfRoutes());
	}

}
