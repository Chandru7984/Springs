package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SouthKitchen {

	@Autowired
	private String area;
	@Autowired
	private int items;
	@Autowired
	private ItemName itemName;
	
	
	public SouthKitchen() {
		System.out.println("create default const...");
	}
	
	public String getArea() {
		return area;
	}
	
	public int getItems() {
		return items;
	}
	
	public void itemDetails() {
		System.out.println(itemName.getItem());
		System.out.println(itemName.getPrice());
	}
	
}
