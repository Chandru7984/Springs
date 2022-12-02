package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrimeMinister {
	
	@Value("Narendra Modi")
	private String name;
	@Value("72")
	private int age;
	@Autowired
	private State state;
	@Value("5")
	private int terms;
	@Autowired
	@Qualifier("primeMinisterEducation")
	private Education education;
	@Autowired
	@Qualifier("primeMinisterSalary")
	private Salary salary;
	@Value("BJP")
	private String party;
	
	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + ", state=" + state + ", terms=" + terms + ", education="
				+ education + ", salary=" + salary + ", party=" + party + "]";
	}
	
	

}
