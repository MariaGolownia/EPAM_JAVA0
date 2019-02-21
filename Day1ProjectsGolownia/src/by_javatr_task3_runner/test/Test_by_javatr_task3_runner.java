package by_javatr_task3_runner.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import by_javatr_task3_runner.util.Square;

class Test_by_javatr_task3_runner {

	@Test
	void defineAreaOfInternalSquareTestPositive() {
		double areaOfExternalSquare = 50;
		double expected = 25.0;
		
		Square square1 = new Square();
		square1.setAreaOfSquare(areaOfExternalSquare);
		double actual = square1.defineAreaOfInternalSquare(areaOfExternalSquare);
		assertEquals(expected, actual); 
	}
	
	@Test
	void defineAreaOfInternalSquareNullTestPositive() {
		double areaOfExternalSquare = 0;
		double expected = 0;
		Square square1 = new Square();
		square1.setAreaOfSquare(areaOfExternalSquare);
		double actual = square1.defineAreaOfInternalSquare(areaOfExternalSquare);
		assertEquals(expected, actual); 
	}

}
