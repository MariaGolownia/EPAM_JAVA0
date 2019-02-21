package by_javatr_task3_runner.util;

public class Rouding {
	public static double roundTo2DigitAfterComma (Double number) {
		double result = (double)Math.round(number*100)/100;
		return result;
	}
}
