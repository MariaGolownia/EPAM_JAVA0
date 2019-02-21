package by_javatr_task7_runner.runner;
//Даны две точки А(х1, у1) и В(х2, у2). 
//Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.
import by_javatr_task7_runner.print.PrintToConsole;
import by_javatr_task7_runner.util.Point;
import scan.Scan;

public class Runner7 {
	
public static void main(String[] args)  {
	double  x1;
	double  y1;
	double  x2;
	double  y2;
	PrintToConsole.println("Enter x1: ");
	x1 = Scan.getNextDoubleFromConsole();
	PrintToConsole.println("Enter y1: ");
	y1 = Scan.getNextDoubleFromConsole();
	PrintToConsole.println("Enter x2: ");
	x2 = Scan.getNextDoubleFromConsole();
	PrintToConsole.println("Enter y2: ");
	y2 = Scan.getNextDoubleFromConsole();
	Point point1 = new Point(x1, y1);
	Point point2 = new Point(x2, y2);
	
	PrintToConsole.print("The point closest to origin is: " + Point.determinePointClosestToOrigin(x1, y1, x2, y2));
}

}
