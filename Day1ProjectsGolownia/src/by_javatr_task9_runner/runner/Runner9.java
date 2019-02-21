package by_javatr_task9_runner.runner;

import by_javatr_task9_runner.util.Circle;
import by_javatr_task9_runner.print.PrintToConsole;
import by_javatr_task9_runner.exc.RadiusCanNotBeZeroOrNegative;
import scan.Scan;

public class Runner9 {
	//Task 9: ¬ычислить длину окружности и площадь круга одного и того же заданного радиуса R.

	public static void main(String[] args) {
		double radiusOfCircle;
		double lengthOfCircle;
		double areaOfCircle;
		
		PrintToConsole.print("Enter a radius of the circle: ");
		radiusOfCircle = Scan.getNextDoubleFromConsole();
		if (radiusOfCircle <= 0) {
			try {
				throw new RadiusCanNotBeZeroOrNegative ("The radius of the circle must be positive! ");
			} catch (RadiusCanNotBeZeroOrNegative e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			else {
				Circle circle = new Circle (radiusOfCircle);
				lengthOfCircle = circle.defineLength(radiusOfCircle);
				areaOfCircle = circle.defineArea(radiusOfCircle);
				PrintToConsole.println("The area of the circle: " + areaOfCircle);
				PrintToConsole.println("The length of the circle: " + lengthOfCircle);
			
		}
		
	}
}
