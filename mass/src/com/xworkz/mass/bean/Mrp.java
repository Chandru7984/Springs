package com.xworkz.mass.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mrp {
	
	
	private String ownerName;
	@Value("BTM")
	private String area;
	@Autowired
	private double closingTime;
	@Autowired
	private Brand brand;
	
	public Mrp() {
		System.out.println("Create MRP using default const...");
	}

	public Mrp(String ownerName) {
		super();
		this.ownerName = ownerName;
	}
	
	public void setClosingTime(double closingTime) {
		this.closingTime = closingTime;
	}
	
	public void brandDetails() {
		System.out.println(brand);
	}

	@Override
	public String toString() {
		return "Mrp [ownerName=" + ownerName + ", area=" + area + ", closingTime=" + closingTime + "]";
	}
	
	
	
	
	
	
	
	
	

}
