package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class President {
	
	@Value("Droupadi Murmu")
	private String name;
	@Value("64")
	private int age;
	@Autowired
	@Qualifier("presidentSalary")
	private Salary salary;
	@Value("Declare war")
	private String expertise;
	@Autowired
	@Qualifier("presidentEducation")
	private Education education;
	
	
	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + ", salary=" + salary + ", expertise=" + expertise
				+ ", education=" + education + "]";
	}

}
