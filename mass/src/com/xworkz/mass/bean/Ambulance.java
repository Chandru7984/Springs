package com.xworkz.mass.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ambulance {
	
	private String serviceType;
	private String vehicletype;
	private String regNo;
	@Autowired
	private boolean patient;
	@Autowired
	private boolean syren;
	
	public Ambulance() {
		System.out.println("create Ambulance using default const...");
	}
	
	public Ambulance(String serviceType, String vehicletype) {
		super();
		this.serviceType = serviceType;
		this.vehicletype = vehicletype;
	}

	public void setRegNo(@Value("KA 17") String regNo) {
		this.regNo = regNo;
	}

	public boolean isPatient() {
		return patient;
	}
	
	public boolean isSyren() {
		return syren;
	}

	@Override
	public String toString() {
		return "Ambulance [serviceType=" + serviceType + ", vehicletype=" + vehicletype + ", regNo=" + regNo
				+ ", patient=" + patient + ", syren=" + syren + "]";
	}
	
	
	
	
}
