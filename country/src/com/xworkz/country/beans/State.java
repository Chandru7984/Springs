package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class State {
	
	@Value("Gujarat")
	private String name;
	@Value("64000000")
	private int population;
	@Value("Gandinagar")
	private String capitalCity;
	@Value("33")
	private int noOfDistricts;
	@Value("196024.0")
	private double area;
	@Autowired
	@Qualifier("stateCMName")
	private Name cmName;
	@Value("Gujarati")
	private String primaryLang;
	
	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLang="
				+ primaryLang + "]";
	}
	

}
