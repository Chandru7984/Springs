package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnionTerriotories {
	
	@Autowired
	@Qualifier("unionTerritoryNames")
	private Name name;
	@Value("59146.0")
	private double area;
	@Value("Anil Baijal")
	private String governorName;
	@Value("32066000")
	private int population;
	
	@Override
	public String toString() {
		return "UnionTerriotories [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}

}
