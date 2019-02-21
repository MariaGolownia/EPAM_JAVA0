package by_javatr_task2_runner.exc;

public class ExceptionIncorrectMonth extends Exception {

	public ExceptionIncorrectMonth (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "ExceptionIncorrectMonth" + ", message = " + getMessage();
	}

}
