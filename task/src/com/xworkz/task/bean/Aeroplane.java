package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aeroplane {

	@Autowired
	private String company;
	@Autowired
	private int noOfSeats;
	@Autowired
	private Pilot pilot;

	public String getCompany() {
		return company;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void display() {
		System.out.println(pilot.getPilotName());
		System.out.println(pilot.getPilotAge());
	}
}
