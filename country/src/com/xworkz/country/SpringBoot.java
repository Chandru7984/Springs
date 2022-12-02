package com.xworkz.country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.country.beans.Country;
import com.xworkz.country.configuration.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Country bean = context.getBean(Country.class);
		System.out.println(bean);
	}

}
