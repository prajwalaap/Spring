package com.SpEL;

import java.util.List;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TestSpEL {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("SpEL.xml");
		Insurance status =  (Insurance) context.getBean("bike");
		System.out.println(status.getCurrentOffer().getGetOffer());
		System.out.println(status.getService());
		System.out.println(status.getNames());
		List<String> n = status.getNames();
		for (String string : n) {
			System.out.println(string);
			
		}
	}

}
