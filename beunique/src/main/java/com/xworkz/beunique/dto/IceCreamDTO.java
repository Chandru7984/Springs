package com.xworkz.beunique.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IceCreamDTO {
	
	private String type;
	private String brand;
	private String flavour;
	private int price;
	private double quantity;

}
