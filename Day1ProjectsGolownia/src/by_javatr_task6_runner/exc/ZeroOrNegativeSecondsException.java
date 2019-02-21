package by_javatr_task6_runner.exc;

public class ZeroOrNegativeSecondsException extends Exception {

	public ZeroOrNegativeSecondsException (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "ZeroOrNegativeSecondsException" + ", message=" + getMessage();
	}

}
