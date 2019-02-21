package by_javatr_task7_runner.util;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double defineDistanceToOrigin (double x, double y) {
		return (Math.sqrt(x*x + y*y));
	}
	
	public static Point determinePointClosestToOrigin (double x1, double y1, double x2, double y2) {
		if (defineDistanceToOrigin (x1, y1) < defineDistanceToOrigin (x2, y2)) 
			return new Point(x1, y1);
		else if (defineDistanceToOrigin (x1, y1) >= defineDistanceToOrigin (x2, y2)) 
			return new Point(x2, y2);
		else return new Point(0, 0);	
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
