package com.DIwrtProperty;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("studentbean");
		student.displayInfo();
		System.out.println(student);
	}
}
