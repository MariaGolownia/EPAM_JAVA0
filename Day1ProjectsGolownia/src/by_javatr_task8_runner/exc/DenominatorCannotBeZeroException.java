package by_javatr_task8_runner.exc;

public class DenominatorCannotBeZeroException extends Exception  {
	private static final long serialVersionUID = 1L;

	public DenominatorCannotBeZeroException (String message){
		super (message);
	}

	@Override
	public String toString() {
		return  "DenominatorCannotBeZeroException" + ", message=" + getMessage();
	}

}
