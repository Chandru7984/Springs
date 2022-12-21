package com.xworkz.showroom.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShowroomDTO {

	private String brand;
	private String owner;
	private String location;
	private String ambassador;
	private String description;
	
	@Override
	public String toString() {
		return "ShowroomDTO [brand=" + brand + ", owner=" + owner + ", location=" + location + ", ambassador="
				+ ambassador + ", description=" + description + "]";
	}
	
	
	
}
