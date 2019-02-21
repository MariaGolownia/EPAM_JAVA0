package by_javatr_task10_runner.exc;

public class PositionException extends Exception{
	
	public PositionException (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "PositionException" + ", message = " + getMessage();
	}
}
