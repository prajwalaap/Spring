package com.code.MVC_1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVC_Confifg implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers (ViewControllerRegistry registry){
		registry.addViewController("/").setViewName("home");
	}

}
