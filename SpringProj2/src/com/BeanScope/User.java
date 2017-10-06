package com.BeanScope;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("BeanScope.xml");
		Insurance status = (Insurance) context.getBean("bike");
		System.out.println("default offer1 :"+status.getCurrentOffer().getOffer);
		Insurance status2 = (Insurance) context.getBean("bike");
		System.out.println("default offer2 :"+status2.getCurrentOffer().getOffer);
		status2.getCurrentOffer().setGetOffer("get 10%off");
		System.out.println("updated offer2 :"+status2.getCurrentOffer().getOffer);
		context.close();
		
	}

}
