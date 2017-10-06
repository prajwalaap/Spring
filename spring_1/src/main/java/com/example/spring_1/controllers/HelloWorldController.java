package com.example.spring_1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//	@Value("${app.Name}")     //from application.properties
//	private String appName;    //when the application.properties and jar pkg of  the same project is the production env then value from external environment takes precedence 
	
	@RequestMapping("/hello")
	public String HelloWorld(){
		return "Hello world!!";
	}

}
