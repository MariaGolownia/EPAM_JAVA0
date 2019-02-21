package by_javatr_task5_runner.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import by_javatr_task5_runner.util.Action;

class Test_by_javatr_task5_runner {

	@Test
	void isSquareOfNumberEqualToCubeOfSumItsDigitsTestPositive() {
		int threeDigitNumber = 0;
		Boolean expected = false;
		threeDigitNumber = 100;

		Boolean actual = Action.isSquareOfNumberEqualToCubeOfSumItsDigits(threeDigitNumber);
		assertEquals(expected, actual);
	}

}
