package by_javatr_task1_runner.util;
import by_javatr_task1_runner.exc.IncorrectNumberInputException;
import by_javatr_task1_runner.valid.ValidationNumber;
import scan.Scan;

public class Action {

	//����� ��� ����������� ��������� ����� �����
	public int determineLastDigitOfNumber(String valueString) {
		int lastDigitOfNumber = 0;
		String strAfterChangingDotToComma = Replace.replaceDotToComma(valueString);
		// �������e � ������, ���� ��������� ������ �� �������� ������
		if (!ValidationNumber.validateIfNumber(valueString)) {
			try {
				throw new IncorrectNumberInputException ("Check the correctness of the entered number!");
			} catch (IncorrectNumberInputException ex) {
				ex.printStackTrace(); 
				ex.getMessage();
				System.exit(-1);}
		}
		// �������e � ������, ���� ��������� ������ �������� ������
		else {
			double doubleTemp = Double.parseDouble(strAfterChangingDotToComma);
			String strTemp = String.valueOf(doubleTemp);
			// �������e � ������, ���� ����� �������� �������
			if(!ValidationNumber.ifInteger(doubleTemp)) {
				lastDigitOfNumber = Integer.parseInt(strTemp.substring(strTemp.length()-1));}
			// �������e � ������, ���� ����� �������� �����
			else {
				int intTemp = (int) doubleTemp;	
				lastDigitOfNumber = intTemp%10;}			
		}
		return lastDigitOfNumber;
	}
 
	//����� ��� ����������� �������� ������ �����
	public int determineSquare(int number){
		int result = number * number;
		return result;
	}

	//����� ��� ����������� ��������� ����� ������ �����
	public int determineLastDigit (int number){
		int result = number%10;
		return result;
	}

	// ����� ��� ����������� ��������� ����� �������� ��������� ����� ����� � �������
	public int determineLastDigitSquareLastDigitOfNumber() throws IncorrectNumberInputException{
		int result = determineLastDigit(
				determineSquare((
						determineLastDigit(
								determineLastDigitOfNumber(Scan.getNextStringFromConsole())))));
		return result;
	}

	// ����� ��� ����������� ��������� ����� �������� ��������� ����� ���������� �����, ����������� �� ������
	public int determineLastDigitSquareLastDigitOfNumber(String str) throws IncorrectNumberInputException{
		int result = determineLastDigit(determineSquare((
				determineLastDigit(
						determineLastDigitOfNumber(str)))));
		return result;
	}

}
