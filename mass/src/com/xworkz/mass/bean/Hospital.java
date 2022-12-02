package com.xworkz.mass.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hospital {
	
	private String hospitalName;
	@Value("true")
	private boolean operationTheatre;
	private int since;
	@Autowired
	private Ambulance ambulance;
	
	public Hospital() {
		System.out.println("create Hospital using default const...");
	}

	public Hospital(String hospitalName) {
		super();
		this.hospitalName = hospitalName;
	}
	
	public void setSince(@Value("1999") int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", operationTheatre=" + operationTheatre + ", since=" + since
				+ "]";
	}
	
	public void ambulanceDetails() {
		System.out.println(ambulance);
	}
	
	
	

}
