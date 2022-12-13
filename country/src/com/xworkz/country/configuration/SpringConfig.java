package com.xworkz.country.configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.country.beans.Education;
import com.xworkz.country.beans.Name;
import com.xworkz.country.beans.Salary;
import com.xworkz.country.beans.UnionTerriotories;
import com.xworkz.country.enums.NameType;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("Register SpringConfiguration");
	}

	@Bean
	public Education presidentEducation() {
		Education education = new Education(1, "Rama Devi", "B.A", 1978, "Odisha", 0, 80.0, true);
		return education;
	}

	@Bean
	public Education vicePresidentEducation() {
		Education education = new Education(2, "Rajasthan", "LLB", 1979, "Rajasthan", 0, 70.0, true);
		return education;
	}

	@Bean
	public Education primeMinisterEducation() {
		Education education = new Education(3, "Gujarat", "SSLC", 1970, "Gujarat", 0, 60.0, true);
		return education;
	}

	@Bean
	public Salary presidentSalary() {
		Salary salary = new Salary(500000.0, 6750000.0, 200000.0, 1000000.0, 500000.0, 1000000.0, 1000000.0, 50000.0);
		return salary;
	}

	@Bean
	public Salary vicePresidentSalary() {
		Salary salary = new Salary(400000.0, 6050000.0, 100000.0, 900000.0, 400000.0, 900000.0, 900000.0, 50000.0);
		return salary;
	}

	@Bean
	public Salary primeMinisterSalary() {
		Salary salary = new Salary(200000.0, 3000000.0, 100000.0, 700000.0, 300000.0, 700000.0, 700000.0, 50000.0);
		return salary;
	}
	
	@Bean
	public Name stateCMName() {
		Name name = new Name("Bhupendra", "bhai", "Patel");
		return name;
	}
	
	@Bean 
	public UnionTerriotories[] unionTerritoryNames() {
		UnionTerriotories terriotories = new UnionTerriotories("Delhi", 125360, "Nanu", 12589305);
		UnionTerriotories terriotories1 = new UnionTerriotories("Lakshadweep", 65489, "Neenu", 8956236);
		UnionTerriotories[] union = {terriotories,terriotories1};
		return union;
		
	}
	
	@Bean 
	public Name capitalCityName() {
		Name name = new Name("New", "Delhi", "");
		return name;
	}
	
	@Bean
	public NameType type () {
		return NameType.PERSON;
	}
}
