package by_javatr_task6_runner.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import by_javatr_task5_runner.print.PrintToConsole;
import by_javatr_task6_runner.exc.ZeroOrNegativeSecondsException;
import by_javatr_task6_runner.util.Time;
import scan.Scan;

class Test_by_javatr_task6_runner {

	@Test
	void TimeTest() throws ZeroOrNegativeSecondsException {
		int expectedHours = 1;
		int expectedMinutes = 1;
		int expectedSeconds = 1;
    	Time time = new Time (3661);
		int actualHours = time.getHours();
		int actualMinutes =  time.getMinutes();
		int actualSeconds = time.getSeconds();
		assertEquals(expectedHours, actualHours);
		assertEquals(expectedMinutes, actualMinutes);
		assertEquals(expectedSeconds, actualSeconds);

	}
	@Test
	void TimeTest2() throws ZeroOrNegativeSecondsException {
		int expectedHours = 0;
		int expectedMinutes = 0;
		int expectedSeconds = 0;
    	Time time = new Time (0);
		int actualHours = time.getHours();
		int actualMinutes =  time.getMinutes();
		int actualSeconds = time.getSeconds();
		assertEquals(expectedHours, actualHours);
		assertEquals(expectedMinutes, actualMinutes);
		assertEquals(expectedSeconds, actualSeconds);

	}

}
