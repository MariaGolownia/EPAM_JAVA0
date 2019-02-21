package by_javatr_task2_runner.util;
import by_javatr_task2_runner.exc.ExceptionIncorrectMonth;
import by_javatr_task2_runner.exc.ExceptionIncorrectYear;

public class Date {
	private int month;
	private int year;
	final static int  MAX_COUNT_DAYS_IN_MONTH = 31;
	final static int  MAX_COUNT_DAYS_IN_MONTH_EXCEPT_FEBRUARY = 30;
	final static int   MIN_COUNT_DAYS_IN_FEBRUARY = 28;
	final static int  MAX_COUNT_DAYS_IN_FEBRUARY = 29;

	public Date(int month, int year) {
		super();
		this.month = month;
		this.year = year;
	}

	public Date() {
		super();
		this.month = 0;
		this.year = 0;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			try {
				throw new ExceptionIncorrectMonth ("Check the correctness of the month!");
			} catch (ExceptionIncorrectMonth e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year)  {
		if (year < 0) {
			try {
				throw new ExceptionIncorrectYear ("Check the correctness of the year!");
			} catch (ExceptionIncorrectYear e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		else {
		 this.year = year;}
	}

	public static int calcDaysInMonth (int numberOfMonth, int numberOfYear)	{
		int daysInMonth = 0;
		Boolean isLeapYear = Year.isLeapYear(numberOfYear);
		switch (numberOfMonth) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = MAX_COUNT_DAYS_IN_MONTH;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth=MAX_COUNT_DAYS_IN_MONTH_EXCEPT_FEBRUARY;
			break;
		case 2:
			if (isLeapYear) {
				daysInMonth=MAX_COUNT_DAYS_IN_FEBRUARY;}
			else {
				daysInMonth= MIN_COUNT_DAYS_IN_FEBRUARY ;}
			break;

		default:
			//System.out.println("Error: check the correct month of birth!");
			break;
		}
		return daysInMonth;
	}
}
