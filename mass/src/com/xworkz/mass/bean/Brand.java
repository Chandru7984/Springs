package com.xworkz.mass.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Brand {

	private String name;
	private int price;
	private double manufactureYear;
	@Autowired
	private double quantity;
	@Autowired
	private String type;
	
	public Brand() {
		System.out.println("create Brand using default const...");
	}

	public Brand(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void setManufactureYear(@Value("2022") double manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Brand [name=" + name + ", price=" + price + ", manufactureYear=" + manufactureYear + ", quantity="
				+ quantity + ", type=" + type + "]";
	}
	
	
	
}
