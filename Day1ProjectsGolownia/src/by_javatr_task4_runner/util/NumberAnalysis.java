package by_javatr_task4_runner.util;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.ParseConversionEvent;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import by_javatr_task4_runner.valid.ValidationNumber;
import scan.Scan;

public class NumberAnalysis{

	//����� ��� ����������� ���� ����� �������� ����� ����� �, �, �, D ���� ���� �� ��� ������.
	public boolean isTwoEvenNumbers (ArrayList array) {
		byte countEvenNumber = 0;
		for (int i = 0; i < array.size(); i ++) {
			if (ValidationNumber.isEven((int) array.get(i))){
				countEvenNumber++;
			}
			else continue;
		}
		if (countEvenNumber > 1) return true;
		else return false;
	}
	
}

	

