package by_javatr_task4_runner.runner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.geom.transform.GeneralTransform3D;

import by_javatr_task1_runner.print.PrintToConsole;
import by_javatr_task1_runner.util.Action;
import by_javatr_task4_runner.util.NumberAnalysis;
import scan.Scan;
// Task4: Составить программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
public class Runner {

	public static void main(String[] args) {
		Boolean ifTwoOrMoreEvenNumbers;
		NumberAnalysis numberAnalysis1 = new NumberAnalysis ();
		ArrayList<Integer>  arrayOfNumber = new ArrayList<>();
		
		PrintToConsole.print("Enter first integer:");
		arrayOfNumber.add(Scan.getNextIntFromConsole());
		PrintToConsole.print("Enter second integer:");
		arrayOfNumber.add(Scan.getNextIntFromConsole());
		PrintToConsole.print("Enter third integer:");
		arrayOfNumber.add(Scan.getNextIntFromConsole());
		PrintToConsole.print("Enter fourth integer:");
		arrayOfNumber.add(Scan.getNextIntFromConsole());
		ifTwoOrMoreEvenNumbers = numberAnalysis1.isTwoEvenNumbers(arrayOfNumber);
		PrintToConsole.print("Among the entered numbers are two or more even numbers: " + ifTwoOrMoreEvenNumbers);
		
	}
}