package by_javatr_task2_runner.util;

public class Year {

	public static Boolean isLeapYear (int numberOfYear)	{
			
		return (numberOfYear%4==0) && (numberOfYear%100!=0) || (numberOfYear%400==0);
	}
	
}
