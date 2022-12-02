package com.xworkz.country.enums;

public enum NameType {
	
	PERSON("person"), PLACE("place");
	
	private String values;
	
	private NameType(String values) {
		this.values = values;
	}
	
	public String getValues() {
		return values;
	}
	
	

}
