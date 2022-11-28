package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Captain {

	@Autowired
	private String captainName;
	@Autowired
	private int captainAge;

	public String getCaptainName() {
		return captainName;
	}

	public int getCaptainAge() {
		return captainAge;
	}
}
