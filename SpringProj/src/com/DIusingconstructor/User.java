package com.DIusingconstructor;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class User {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext contexts = new FileSystemXmlApplicationContext("User1.xml");
		Insurance insurStatus = (Insurance) contexts.getBean("bikeInsur");
		System.out.println(insurStatus.showStatus());
	}
	
	

}
