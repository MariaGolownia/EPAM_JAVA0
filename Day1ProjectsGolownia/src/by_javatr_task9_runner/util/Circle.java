package by_javatr_task9_runner.util;

import by_javatr_task8_runner.util.Rouding;

public class Circle {
	private double radius;
	final static double NUMBER_PI = 3.14;
	final static int HOW_MANY_TIMES_DIAMETER_GREATER_RADIUS = 2;
	public Circle(double radius) {
		super();
		if (radius > 0) {
		this.radius = radius;}
		else 
			this.radius = 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double defineArea (double radius) {
		return Rouding.roundTo2DigitAfterComma(NUMBER_PI * radius * radius);
	}
	
	public double defineLength (double radius) {
		return Rouding.roundTo2DigitAfterComma(HOW_MANY_TIMES_DIAMETER_GREATER_RADIUS * NUMBER_PI * radius);
	}
	
	

}
