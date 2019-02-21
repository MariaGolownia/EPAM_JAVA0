package by_javatr_task6_runner.runner;
import by_javatr_task5_runner.print.PrintToConsole;
import by_javatr_task6_runner.exc.ZeroOrNegativeSecondsException;
import by_javatr_task6_runner.util.Time;
import scan.Scan;
// Task6: Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.

public class Runner6 {

	public static void main(String[] args)  {
		int countOfSeconds;

		PrintToConsole.print("Count of seconds: ");
		countOfSeconds = Scan.getNextIntFromConsole();
		Time time;
		if (countOfSeconds < 0)		{
			try {
				throw new ZeroOrNegativeSecondsException ("Error! The number of seconds must be positive!");
			} catch (ZeroOrNegativeSecondsException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				time = new Time (countOfSeconds);
				PrintToConsole.print("Count of hours: " + time.getHours());
				PrintToConsole.print("Count of minutes: " + time.getMinutes());
				PrintToConsole.print("Count of seconds: " + time.getSeconds());
			} catch (ZeroOrNegativeSecondsException e) {
				e.getMessage();
				e.printStackTrace();
			}

		}

	}
}