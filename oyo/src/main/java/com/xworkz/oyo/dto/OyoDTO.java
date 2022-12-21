package com.xworkz.oyo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OyoDTO {
	
	private String location;
	private String state;
	private String customerName;
	private int age;
	private double fees;
	private int pincode;
	private long contactNo;
	private int noOfRooms;
	private String ac;
	private String nonAc;
	
	@Override
	public String toString() {
		return "OyoDTO [location=" + location + ", state=" + state + ", customerName=" + customerName + ", age=" + age
				+ ", fees=" + fees + ", pincode=" + pincode + ", contactNo=" + contactNo + ", noOfRooms=" + noOfRooms
				+ ", ac=" + ac + ", nonAc=" + nonAc + "]";
	}
	
	

}
