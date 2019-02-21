package by_javatr_task10_runner.exc;

public class TanException extends Exception {
	public TanException (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "TanException" + ", message = " + getMessage();
	}
}
