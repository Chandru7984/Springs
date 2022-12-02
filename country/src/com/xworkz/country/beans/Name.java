package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.country.enums.NameType;

@Component
public class Name {

	private String firstName;
	private String middleName;
	private String lastName;
	private NameType type;
	
	public Name() {
		System.out.println("default name const...");
	}

	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", type="
				+ type + "]";
	}

}
