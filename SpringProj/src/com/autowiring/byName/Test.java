package com.autowiring.byName;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("autowiringbyName.xml");
	Student2 student2 = (Student2) context.getBean("student2");
	student2.display();
	student2.setId(001);
	student2.setName("abc");
	System.out.println(student2);
}
}
