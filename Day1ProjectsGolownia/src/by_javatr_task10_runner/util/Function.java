package by_javatr_task10_runner.util;
import java.util.ArrayList;
import by_javatr_task10_runner.exc.PositionException;
import by_javatr_task10_runner.exc.TanException;

public class Function {
	private ArrayList <Double> arrayOfFunctionValues = new ArrayList<>();
	private ArrayList <Double> arrayOfArgument = new ArrayList<>();
	public final static double PI_90_DEGREE = 1/2*Math.PI;

	public void setArrayOfArgument(ArrayList<Double> arrayOfArgument) {
		this.arrayOfArgument = arrayOfArgument;
	}

	public ArrayList<Double> getArrayOfFunctionValues() {
		return arrayOfFunctionValues;
	}

	public Double getArrayFirstElementOfFunctionValues() {
		return arrayOfFunctionValues.get(0);
	}

	public void setArrayOfFunctionValues(ArrayList<Double> arrayOfFunctionValues) {
		this.arrayOfFunctionValues = arrayOfFunctionValues;
	}


	public ArrayList<Double> getArrayOfArgument() {
		return arrayOfArgument;
	}

	public Double getFirstElementArrayOfArgument() {
		return arrayOfArgument.get(0);
	}


	public void findFunctionValues (double start, double finish, double step) {
		if (start >= finish) {
			try {
				throw new PositionException ("Start position can not be equal or less than finish position!");
			} catch (PositionException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		else {
			for (double i = start; i < finish; i += step) {
				if (i == PI_90_DEGREE) {
					try {
						throw new TanException ("Start position can not be equal or less than finish position!");
					} catch (TanException e) {
						e.printStackTrace();
						e.getMessage();
					}
				}
				else {
				arrayOfArgument.add(i);
				arrayOfFunctionValues.add(Rounding.roundTo2DigitAfterComma(Math.tan(i)));	}
			}
		}
	}


	@Override
	public String toString() {
		return "Function: \n [arrayOfFunctionValues=" + arrayOfFunctionValues + ",\n arrayOfArgument=" + arrayOfArgument
				+ "]";
	}
	
	public String toTable() {
		String StrTable = "\n  X   F(X)\n ";
		for (int i = 0; i < arrayOfFunctionValues.size(); i++) {
			StrTable += arrayOfArgument.get(i).toString() + " " + arrayOfFunctionValues.get(i).toString() + "\n ";
			
		}
		return StrTable;
	}


}
