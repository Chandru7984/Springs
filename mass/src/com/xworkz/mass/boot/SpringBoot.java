package com.xworkz.mass.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mass.bean.Hospital;
import com.xworkz.mass.bean.Mrp;
import com.xworkz.mass.configuration.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	
		System.out.println("=====MRP=====");
		Mrp bean = context.getBean(Mrp.class);
		System.out.println(bean);
		bean.brandDetails();
		
		System.out.println("=====Hospital======");
		
		Hospital bean2 = context.getBean(Hospital.class);
		System.out.println(bean2);
		bean2.ambulanceDetails();
		
		

	}

}
