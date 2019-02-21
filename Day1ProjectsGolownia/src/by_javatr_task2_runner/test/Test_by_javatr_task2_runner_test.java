package by_javatr_task2_runner.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by_javatr_task2_runner.util.Date;

class Test_by_javatr_task2_runner_test {

	@Test
	public void calcDaysInMonthFebruaryNotLeapTestPositive () {		
		int expected = 28;
		int year = 2019;
		int month = 2;		
		Date date1 = new Date(month, year);
		int actual  = Date.calcDaysInMonth(date1.getMonth(), date1.getYear());
		assertEquals(expected, actual);
	}
	
	@Test
	public void calcDaysInMonthFebruaryLeapTestPositive () {		
		int expected = 29;
		int year = 2000;
		int month = 2;		
		Date date1 = new Date(month, year);
		int actual  = Date.calcDaysInMonth(date1.getMonth(), date1.getYear());
		assertEquals(expected, actual);
	}

	@Test
	public void calcDaysInMonthDecemberNotLeapTestPositive () {		
		int expected = 31;
		int year = 2019;
		int month = 12;		
		Date date1 = new Date(month, year);
		int actual  = Date.calcDaysInMonth(date1.getMonth(), date1.getYear());
		assertEquals(expected, actual);
	}
}
