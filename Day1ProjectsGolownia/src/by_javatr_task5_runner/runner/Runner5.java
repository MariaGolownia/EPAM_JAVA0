package by_javatr_task5_runner.runner;
import by_javatr_task5_runner.exc.NotThreeDigitNumberException;
import by_javatr_task5_runner.print.PrintToConsole;
import by_javatr_task5_runner.util.Action;
import scan.Scan;
// Task5: —оставить программу, печатающую значение true, если указанное высказывание €вл€етс€ истинным,
//и false Ч в противном случае: квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

public class Runner5 {

	public static void main(String[] args) {
	
		int threeDigitNumber = 0;
		Boolean isEqual;

		
		PrintToConsole.print("Entered a three-digit number: ");
		threeDigitNumber = Scan.getNextIntFromConsole();
		if (threeDigitNumber > 999 || threeDigitNumber <100) {
			try {
				throw new NotThreeDigitNumberException ("The number must consist of three digits!");
			} catch (NotThreeDigitNumberException e) {
				e.printStackTrace();
			}
		}
		isEqual = Action.isSquareOfNumberEqualToCubeOfSumItsDigits(threeDigitNumber);
		PrintToConsole.print("Square of number is equal to cube of sum its digits: " + isEqual);

	}
}