package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CapitalCity {

	@Autowired
	@Qualifier("capitalCityName")
	private Name name;
	@Value("true")
	private boolean capital;

	@Override
	public String toString() {
		return "CapitalCity [name=" + name + ", capital=" + capital + "]";
	}

}
