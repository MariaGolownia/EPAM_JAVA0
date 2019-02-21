package by_javatr_task1_runner.exc;

public class IncorrectNumberInputException extends Exception {

	public IncorrectNumberInputException (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "IncorrectNumberInputException" + ", message = " + getMessage();
	}

}
