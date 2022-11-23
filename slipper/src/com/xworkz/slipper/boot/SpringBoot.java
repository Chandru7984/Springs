package com.xworkz.slipper.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.xworkz.slipper.bean.Slipper;
import com.xworkz.slipper.configuration.SpringConf;


public class SpringBoot {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);
		
		Slipper bean = context.getBean(Slipper.class);
		
		bean.protect();
		

	}

}
