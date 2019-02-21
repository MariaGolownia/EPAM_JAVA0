package by_javatr_task7_runner.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import by_javatr_task7_runner.print.PrintToConsole;
import by_javatr_task7_runner.util.Point;
import scan.Scan;

class Test_by_javatr_task7_runner {

	@Test
	void testDeterminePointClosestToOrigin() {
		Point expectedPoint = new Point (1, 2);
		double x1 = 5;
		double y1 = 7;
		double x2 = 1;
		double y2 = 2;
		Point actualPoint = Point.determinePointClosestToOrigin(x1, y1, x2, y2);
		assertEquals(expectedPoint.getX(), expectedPoint.getX());
		assertEquals(expectedPoint.getY(), expectedPoint.getY());
	}

}
