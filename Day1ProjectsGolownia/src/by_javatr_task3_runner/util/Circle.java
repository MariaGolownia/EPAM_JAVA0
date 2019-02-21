package by_javatr_task3_runner.util;

import by_javatr_task3_runner.exc.IncorrectAreaException;

public class Circle {
	private double areaOfCircle ;

	
	public Circle(double areaOfCircle) {
		super();
		this.areaOfCircle = areaOfCircle;
	}

	public Circle() {
		super();
		this.areaOfCircle = 0;
	}
	
	public double getAreaOfCircle() {
		return areaOfCircle;
	}


	public void setAreaOfCircle(double areaOfCircle)  {
		if (areaOfCircle < 0) {
			try {
				throw new IncorrectAreaException ("The area of circle can not be negative or zero!");
			} catch (IncorrectAreaException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		else {
		this.areaOfCircle = areaOfCircle;}
	
	}


	public static double defineRadiusOfCircleInSquare(double areaOfSquare) {
		double result = (Square.defineSideOfSquare(areaOfSquare))/2;
		return result;
	}
	

}
