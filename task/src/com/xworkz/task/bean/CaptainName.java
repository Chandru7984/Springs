package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CaptainName {
	
	@Autowired
	private String captainName;
	@Autowired
	private int captainCenturies;
	
	public CaptainName() {
		System.out.println("create captain using default const...");
	}
	
	public String getCaptainName() {
		return captainName;
	}
	
	public int getCaptainCenturies() {
		return captainCenturies;
	}

}
