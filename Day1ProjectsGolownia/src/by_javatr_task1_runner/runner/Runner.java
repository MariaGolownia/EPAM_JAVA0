package by_javatr_task1_runner.runner;
import by_javatr_task1_runner.exc.IncorrectNumberInputException;
import by_javatr_task1_runner.print.PrintToConsole;
import by_javatr_task1_runner.util.Action;
// Task1: �������� ���������, ����������� �� ��������� ����� ����� ���������� ��������� ����� ��� ��������.
//����������: � ������ ���������� ����� (�������� ��� ������) ������������� ���� ������
// (��� ������ - ���� ����� �����, ���� ������� ����). 
//��� ������� ������������ ��� ������ �����: ������� �� ������� �� 10,
//��� �������� �����: ��������� ��������� ����� ������� �����.

public class Runner {

	public static void main(String[] args) {
		int lastDigit;
		PrintToConsole.println("Task 1: Determination the last square's digit of the last number's digit");
		Action act = new Action ();
		while (true) {
			try {
				PrintToConsole.print("\n");
				PrintToConsole.print("Enter a fractional or integer number:");
				lastDigit = act.determineLastDigitSquareLastDigitOfNumber();
				PrintToConsole.println(" The last square's digit of the last number's digit is: " + lastDigit);

			} catch (IncorrectNumberInputException ex) {
				ex.getMessage();
			}			
		}
	}
}