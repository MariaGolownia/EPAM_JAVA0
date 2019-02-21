package by_javatr_task8_runner.util;

public class Function {
	//Вычислить значение функции:
	//y=-x`2+3x+9, если x >= 3
	//y=1 /(x`3 - 6), если x < 3
	
	public double solveEquation (double x) {
		double y;
		if (x >= 3) {
			y = Rouding.roundTo2DigitAfterComma(-Math.pow (x, 2) + 3*x + 9);
		}
		else {
			y =  Rouding.roundTo2DigitAfterComma(1 / (Math.pow (x, 3)-6));
		}
		return y;
	}



}
