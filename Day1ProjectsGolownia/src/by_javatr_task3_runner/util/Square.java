package by_javatr_task3_runner.util;
import by_javatr_task3_runner.exc.IncorrectAreaException;
public class Square  {
private double areaOfSquare;
final static double NUMBER_PI = 3.14;
final static double CONST_HOW_HYPOTENUSE_GREATER_LEG_RIGHT_TRIANGLE = Math.pow(2, 0.5);

public Square(double areaOfSquare) {
	super();
	this.areaOfSquare = areaOfSquare;
}

public Square() {
	super();
	this.areaOfSquare = 0;
}

public double getAreaOfSquare() {
	return areaOfSquare;
}

public void setAreaOfSquare(double areaOfSquare)   {
	if (areaOfSquare <= 0) {	
		try {
		throw new IncorrectAreaException ("The area of the square can not be negative!");}
		catch (IncorrectAreaException ex) {
			ex.printStackTrace();
			ex.getMessage();
		}
	}
	else {
		this.areaOfSquare = areaOfSquare;
	}
}

public static double defineSideOfSquare (double areaOfSquare) {
	double side = Math.pow(areaOfSquare, 0.5);
	return side;
}

public static double defineAreaOfSquare (double sideOfSquare) {
	double result = sideOfSquare * sideOfSquare;
	return result;
}
public double defineSideOfInternalSquare (double areaOfSquare) {
	double result = Circle.defineRadiusOfCircleInSquare(areaOfSquare) * CONST_HOW_HYPOTENUSE_GREATER_LEG_RIGHT_TRIANGLE;
	return result;
}

public double defineAreaOfInternalSquare (double areaOfSquare) {
	double sideOfInternalSquareTemp = defineSideOfInternalSquare(areaOfSquare);
	double result = Rouding.roundTo2DigitAfterComma(defineAreaOfSquare(sideOfInternalSquareTemp));
	return result;
}

}
