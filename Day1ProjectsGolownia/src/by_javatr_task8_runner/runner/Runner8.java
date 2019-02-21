package by_javatr_task8_runner.runner;
import by_javatr_task8_runner.exc.DenominatorCannotBeZeroException;
import by_javatr_task8_runner.print.PrintToConsole;
import by_javatr_task8_runner.util.Function;
import scan.Scan;

// Task 8: Вычислить значение функции:
//y=-x`2+3x+9, если x >= 3
//y=1 /(x`3 - 6), если x < 3
public class Runner8 {
	public static void main(String[] args) {
		double x;
		double y;
		PrintToConsole.print("Enter x:");
		x = Scan.getNextDoubleFromConsole();

		if (x == Math.pow(6, (double)1/3)) {
			try {
				throw new DenominatorCannotBeZeroException ("This equation has no solution! Division by 0 cannot be performed!");
			} catch (DenominatorCannotBeZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			Function func = new Function(); 
			y = func.solveEquation(x);
			PrintToConsole.print("Y is:" + y);
		}
	}

}
