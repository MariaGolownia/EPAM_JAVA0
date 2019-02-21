package by_javatr_task5_runner.util;

import java.util.ArrayList;
import java.util.List;

public class Action {

	public static List<Integer> breakNumberIntoDigits (int number) {
		List <Integer> nums = new ArrayList<>();
		while (number !=0 ) {
			nums.add(number%10);
			number/=10;			
		}
		return nums;
	}

	public static int defineSumOfNumbersDigit(List<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + (int)list.get(i);
		}
		return sum;
	}

	public static boolean isSquareOfNumberEqualToCubeOfSumItsDigits (int number) {
		int sum = defineSumOfNumbersDigit(breakNumberIntoDigits(number));
		Boolean result = Math.pow(sum, 3) == Math.pow(number, 2);
		return result;
	}
}
