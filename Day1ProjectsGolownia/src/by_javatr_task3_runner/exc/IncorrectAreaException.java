package by_javatr_task3_runner.exc;

public class IncorrectAreaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectAreaException (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "ExceptionIncorrectMonth" + ", message=" + getMessage();
	}

}
