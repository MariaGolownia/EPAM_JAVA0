package by_javatr_task10_runner;
import static org.junit.jupiter.api.Assertions.*;
import by_javatr_task10_runner.util.Function;
import scan.Scan;

class Test_by_javatr_task10 {

	@org.junit.jupiter.api.Test
	void findFunctionValuesTest() {
		double startPositionOfSegment = 1;
		double finishPositionOfSegment= 2;
		double step = 1.0;
		double expectedX = 1.0;
		double expectedF = 1.56;		

		Function function = new Function();
		function.findFunctionValues(startPositionOfSegment, finishPositionOfSegment, step);
		double actualX = function.getFirstElementArrayOfArgument();
		double actualY = function.getArrayFirstElementOfFunctionValues();

		assertEquals(expectedX, actualX);
		assertEquals(expectedF, actualY);
	}

}
