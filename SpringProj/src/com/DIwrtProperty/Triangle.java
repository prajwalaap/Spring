package com.DIwrtProperty;

public class Triangle implements Shapes {
	private String triangleType;
	private Circle circleObj;

	@Override
	public void toDraw() {
		System.out.println("triangle is drawn");
	}

	
	


	@Override
	public String toString() {
		return "Triangle [triangleType=" + triangleType +  "]";
	}





	public void setTriangleType(String triangleType) {
		this.triangleType = triangleType;
	}


	public Circle getCircleObj() {
		return circleObj;
	}


	public void setCircleObj(Circle circleObj) {
		this.circleObj = circleObj;
	}

}
