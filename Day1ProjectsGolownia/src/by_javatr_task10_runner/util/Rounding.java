package by_javatr_task10_runner.util;

public class Rounding {
	public static double roundTo2DigitAfterComma (Double number) {
		return (double)Math.round(number*100)/100;
	}
}
