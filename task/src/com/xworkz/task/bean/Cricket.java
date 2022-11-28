package com.xworkz.task.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cricket {
	
	@Autowired
	private String teamName;
	@Autowired
	private int totalScore;
	@Autowired
	private CaptainName captain;
	
	
	public Cricket() {
		System.out.println("create cricket using default const...");
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	public void captainDetails() {
		System.out.println(captain.getCaptainName());
		System.out.println(captain.getCaptainCenturies());
	}

}
