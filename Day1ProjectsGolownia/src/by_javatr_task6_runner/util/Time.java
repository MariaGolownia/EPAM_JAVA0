package by_javatr_task6_runner.util;
import by_javatr_task6_runner.exc.ZeroOrNegativeSecondsException;

public class Time {
private int allTimeInSeconds;
private int seconds;
private int minutes;
private int hours;

public Time(int allTimeInSeconds) throws ZeroOrNegativeSecondsException {
	super();
	if (allTimeInSeconds > 0) {
		this.allTimeInSeconds = allTimeInSeconds;
		this.hours = allTimeInSeconds/3600;
		this.minutes = (allTimeInSeconds - hours*3600)/60;
		this.seconds = allTimeInSeconds - hours*3600 - minutes*60;
	}
}

public int getAllTimeInSeconds() {
	return allTimeInSeconds;
}

public void setAllTimeInSeconds(int allTimeInSeconds) {
	this.allTimeInSeconds = allTimeInSeconds;
}

public int getSeconds() {
	return seconds;
}


public int getMinutes() {
	return minutes;
}

public int getHours() {
	return hours;
}

}
