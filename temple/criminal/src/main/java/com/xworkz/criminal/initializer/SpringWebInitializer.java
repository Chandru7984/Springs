package com.xworkz.criminal.initializer;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.criminal.configuration.SpringBeanConfiguration;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletMappings");
		return new Class[] { SpringBeanConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		File file = new File("D:\\multipart_images\\");
		MultipartConfigElement configElement = new MultipartConfigElement(file.getAbsolutePath(), 1000000000,
				1000000000 * 2, 1000000000 / 2);
		registration.setMultipartConfig(configElement);
	}
}
