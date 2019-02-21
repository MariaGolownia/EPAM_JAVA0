package by_javatr_task1_runner.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import by_javatr_task1_runner.exc.IncorrectNumberInputException;
import by_javatr_task1_runner.util.Action;

class Test_by_javatr_task1 {

	@org.junit.jupiter.api.Test
	public void determineLastDigitSquareLastDigitOfIntegerNumber_Test() throws IncorrectNumberInputException {
		String stringWithNumber = "7";
		int expected = 9;
		Action action1 = new Action();
		int actual = action1.determineLastDigitSquareLastDigitOfNumber(stringWithNumber);
		assertEquals(expected, actual);
	}
	
	public void determineLastDigitSquareLastDigitOfIntegerNumberWithZero_Test() throws IncorrectNumberInputException {
		String stringWithNumber = "7.00000000";
		int expected = 9;
		Action action1 = new Action();
		int actual = action1.determineLastDigitSquareLastDigitOfNumber(stringWithNumber);
		assertEquals(expected, actual);
	}
	
	public void determineLastDigitSquareLastDigitOfDoubleNumber_Test() throws IncorrectNumberInputException {
		String stringWithNumber = "7.82";
		int expected = 4;
		Action action1 = new Action();
		int actual = action1.determineLastDigitSquareLastDigitOfNumber(stringWithNumber);
		assertEquals(expected, actual);
	}
	
	public void determineLastDigitSquareLastDigitOfDoubleNumberWithZero_Test() throws IncorrectNumberInputException {
		String stringWithNumber = "6.59000000000";
		int expected = 1;
		Action action1 = new Action();
		int actual = action1.determineLastDigitSquareLastDigitOfNumber(stringWithNumber);
		assertEquals(expected, actual);
	}
	
	public void determineLastDigitSquareLastDigitOfDoubleNumberZero_Test() throws IncorrectNumberInputException {
		String stringWithNumber = "0";
		int expected = 0;
		Action action1 = new Action();
		int actual = action1.determineLastDigitSquareLastDigitOfNumber(stringWithNumber);
		assertEquals(expected, actual);
	}


}
