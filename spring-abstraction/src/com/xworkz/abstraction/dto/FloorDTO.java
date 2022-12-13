package com.xworkz.abstraction.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class FloorDTO {
	
	@Autowired
	private String floorType;
	@Autowired
	private int area;
	
	
	public FloorDTO(String floorType, int area) {
		super();
		this.floorType = floorType;
		this.area = area;
	}
	
	

}
