package by_javatr_task5_runner.exc;

public class NotThreeDigitNumberException extends Exception {

	public NotThreeDigitNumberException (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "ExceptionIncorrectMonth" + ", message=" + getMessage();
	}

}
