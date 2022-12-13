package com.xworkz.temple.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.temple.configuration.SpringBeanConfiguration;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("It is getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("It is getServletConfigClasses");
		return new Class[] {SpringBeanConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("It is getServletMappings");
		return new String[] {"/"};
	}

}
