package by_javatr_task1_runner.util;
import by_javatr_task1_runner.exc.IncorrectNumberInputException;
import by_javatr_task1_runner.valid.ValidationNumber;
import scan.Scan;

public class Action {

	//Метод для определения последней цифры числа
	public int determineLastDigitOfNumber(String valueString) {
		int lastDigitOfNumber = 0;
		String strAfterChangingDotToComma = Replace.replaceDotToComma(valueString);
		// Действиe в случае, если введенные данные не являются числом
		if (!ValidationNumber.validateIfNumber(valueString)) {
			try {
				throw new IncorrectNumberInputException ("Check the correctness of the entered number!");
			} catch (IncorrectNumberInputException ex) {
				ex.printStackTrace(); 
				ex.getMessage();
				System.exit(-1);}
		}
		// Действиe в случае, если введенные данные являются числом
		else {
			double doubleTemp = Double.parseDouble(strAfterChangingDotToComma);
			String strTemp = String.valueOf(doubleTemp);
			// Действиe в случае, если число является дробным
			if(!ValidationNumber.ifInteger(doubleTemp)) {
				lastDigitOfNumber = Integer.parseInt(strTemp.substring(strTemp.length()-1));}
			// Действиe в случае, если число является целым
			else {
				int intTemp = (int) doubleTemp;	
				lastDigitOfNumber = intTemp%10;}			
		}
		return lastDigitOfNumber;
	}
 
	//Метод для определения квадрата целого числа
	public int determineSquare(int number){
		int result = number * number;
		return result;
	}

	//Метод для определения последней цифры целого числа
	public int determineLastDigit (int number){
		int result = number%10;
		return result;
	}

	// Метод для определения последней цифры квадрата последней цифры числа с консоли
	public int determineLastDigitSquareLastDigitOfNumber() throws IncorrectNumberInputException{
		int result = determineLastDigit(
				determineSquare((
						determineLastDigit(
								determineLastDigitOfNumber(Scan.getNextStringFromConsole())))));
		return result;
	}

	// Метод для определения последней цифры квадрата последней цифры введенного числа, выделенного из строки
	public int determineLastDigitSquareLastDigitOfNumber(String str) throws IncorrectNumberInputException{
		int result = determineLastDigit(determineSquare((
				determineLastDigit(
						determineLastDigitOfNumber(str)))));
		return result;
	}

}
