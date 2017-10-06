package com.DIusingconstructor;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("applicationContext2.xml");
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);
	}

}
