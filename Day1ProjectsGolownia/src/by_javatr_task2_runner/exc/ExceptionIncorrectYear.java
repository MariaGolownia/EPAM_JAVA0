package by_javatr_task2_runner.exc;

public class ExceptionIncorrectYear extends Exception {

	public ExceptionIncorrectYear (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "ExceptionIncorrectYear" + ", message = " + getMessage();
	}

}
