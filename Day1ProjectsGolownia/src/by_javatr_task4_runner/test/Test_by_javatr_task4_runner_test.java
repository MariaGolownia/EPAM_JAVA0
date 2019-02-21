package by_javatr_task4_runner.test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import by_javatr_task4_runner.util.NumberAnalysis;
class Test_by_javatr_task4_runner_test {

	@org.junit.jupiter.api.Test
	public void isTwoEvenNumbersTestPositive () {		
		Boolean expected = true;
		NumberAnalysis numberAnalysis1 = new NumberAnalysis ();
		ArrayList<Integer>  arrayOfNumber = new ArrayList<>();
		arrayOfNumber.add(4);
		arrayOfNumber.add(5);
		arrayOfNumber.add(6);
		arrayOfNumber.add(2);
		Boolean actual = numberAnalysis1.isTwoEvenNumbers(arrayOfNumber);
		assertEquals(expected, actual);
	}
	
	public void isTwoEvenNumbersTestNegative () {		
		Boolean expected = false;
		NumberAnalysis numberAnalysis1 = new NumberAnalysis ();
		ArrayList<Integer>  arrayOfNumber = new ArrayList<>();
		arrayOfNumber.add(1);
		arrayOfNumber.add(5);
		arrayOfNumber.add(9);
		arrayOfNumber.add(2);
		Boolean actual = numberAnalysis1.isTwoEvenNumbers(arrayOfNumber);
		assertEquals(expected, actual);
	}

}
