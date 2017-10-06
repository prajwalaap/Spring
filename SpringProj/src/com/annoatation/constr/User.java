package com.annoatation.constr;
//annotation---is a marker which starts with '@' which gives extra information of the element to the compiler.
//instead of xml , we can use annotation as it is easy and convenient to use.
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class User {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("annotationContext.xml");
		Insure status = (Insure) context.getBean("myInsurance");
		status.showstatus();
	}

}
