package com.udemy.annotation;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CarUser {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("annotationforcar.xml");
		Insurance status = (Insurance) context.getBean("carInsurance");
		System.out.println(status.getOffr().getOfffer());
		status.showstatus();
	}

}
