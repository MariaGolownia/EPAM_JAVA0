package by_javatr_task1_runner.valid;


public class ValidationNumber {
	
	// ��������: ����� �� ����������� ������ ���� ������������ � �������� �������� (����� ��� �������)
	public static Boolean validateIfNumber (String valueString){
		String regex = "^[-+]?[0-9]*[.,]?[0-9]+$";
		Boolean result = valueString.matches (regex);
		return result;
	}
	
	// ��������: �������� �� ����� �����
		public static Boolean ifInteger (double valueDouble){
		Boolean result = (Math.ceil(valueDouble) == Math.floor(valueDouble));
		return result;
		}
}