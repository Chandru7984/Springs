package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VicePresident {

	@Value("Jagdeep Dhankar")
	private String name;
	@Value("71")
	private int age;
	@Autowired
	@Qualifier("vicePresidentSalary")
	private Salary salary;
	@Value("Chairman")
	private String expertise;
	@Autowired
	@Qualifier("vicePresidentEducation")
	private Education education;

	@Override
	public String toString() {
		return "VicePresident [name=" + name + ", age=" + age + ", salary=" + salary + ", expertise=" + expertise
				+ ", education=" + education + "]";
	}

}
