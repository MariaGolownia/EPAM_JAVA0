package by_javatr_task9_runner.exc;

public class RadiusCanNotBeZeroOrNegative extends Exception {
	
	public RadiusCanNotBeZeroOrNegative (String message) {
		super (message);
	}

	@Override
	public String toString() {
		return  "RadiusCanNotBeZeroOrNegative" + ", message=" + getMessage();
	}
}
