package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemName {

	@Autowired
	private String item;
	@Autowired
	private double price;
	
	public ItemName() {
		System.out.println("create default const...");
	}
	
	public String getItem() {
		return item;
	}
	
	public double getPrice() {
		return price;
	}
}
