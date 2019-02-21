package by_javatr_task3_runner.runner;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import by_javatr_task3_runner.print.PrintToConsole;
import by_javatr_task3_runner.util.Circle;
import by_javatr_task3_runner.util.Rouding;
import by_javatr_task3_runner.util.Square;
import scan.Scan;

//Task3: Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?
public class Runner {

	public static void main(String[] args) {
		double areaOfExternalSquare;
		double areaOfInternalSquare;
		
		PrintToConsole.println("Task3: Finding the area of a square inscribed in a circle inside a square of a given radius.");
		Square square1 = new Square();
		PrintToConsole.print("Enter an area of external square:");
		areaOfExternalSquare = Scan.getNextDoubleFromConsole();
		
		square1.setAreaOfSquare(areaOfExternalSquare);
		areaOfInternalSquare = square1.defineAreaOfInternalSquare(areaOfExternalSquare);
		PrintToConsole.print("The area of internal square is: " + Rouding.roundTo2DigitAfterComma(areaOfInternalSquare));
	}
}
