package com.xworkz.human.bean;

import org.springframework.stereotype.Component;

@Component
public class Tv {

	public Tv() {
		System.out.println("Default const.. of TV");
	}
	
	public void watchmovie() {
		System.out.println("watching");
	}
}
