package by_javatr_task2_runner.runner;
import by_javatr_task2_runner.exc.ExceptionIncorrectMonth;
import by_javatr_task2_runner.exc.ExceptionIncorrectYear;
import by_javatr_task2_runner.print.PrintToConsole;
import by_javatr_task2_runner.util.Date;
import by_javatr_task2_runner.util.Year;
import scan.Scan;
// Task2: —оставить программу, котора€ по заданным году и номеру мес€ца определ€ет количество дней в этом мес€це и корректно определ€лись все високосные года.
public class Runner {
	
	public static void main(String[] args) {
		int year;
		int month;
		int days;
		boolean isLeap;
		
		PrintToConsole.println("Task2: Determining the number of days in a month");
		
		PrintToConsole.print("Enter a year:");
		year = Scan.getNextIntFromConsole();
		
		PrintToConsole.print("Enter a month:");
		month = Scan.getNextIntFromConsole();
		Date date1 = new Date(month, year);
			
		isLeap = Year.isLeapYear(date1.getYear());
		days = Date.calcDaysInMonth(date1.getMonth(), date1.getYear());
		PrintToConsole.print("The number of days in the month is: " + days + ".");
		PrintToConsole.print("The year is leap: " + isLeap + ".");

			
}
}