package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UnionTerriotories {

//	@Autowired
	private String name;
//	@Autowired
	private double area;
//	@Autowired
	private String governorName;
//	@Autowired
	private int population;
	
	public UnionTerriotories() {
		System.out.println("default UnionTerritory");
	}

	public UnionTerriotories(String name, double area, String governorName, int population) {
		super();
		this.name = name;
		this.area = area;
		this.governorName = governorName;
		this.population = population;
	}

	@Override
	public String toString() {
		return "UnionTerriotories [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}

	

}
