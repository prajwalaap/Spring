package com.DIwrtProperty;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("drawingApp.xml");
		 Shapes shapes = (Shapes) context.getBean("tri");
		 shapes.toDraw();
		 System.out.println(shapes);
		shapes.getCircleObj().toDraw();
		 
	}

}
