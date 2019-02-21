package scan;

import java.util.Scanner;

public class Scan {
	
	public static String getNextStringFromConsole () {
		Scanner scannerString = new Scanner(System.in);
		while (!scannerString.hasNext()){
			scannerString.nextLine();
		}

		return scannerString.next();
	}

	public static int getNextIntFromConsole () {
		Scanner scannerInt = new Scanner(System.in);
		while (!scannerInt.hasNextInt()){
			scannerInt.nextLine();
		}
		return scannerInt.nextInt();
		
	}
	
	public static double getNextDoubleFromConsole () {
		Scanner scannerDouble = new Scanner(System.in);
		while (!scannerDouble.hasNextDouble()){
			scannerDouble.nextLine();
		}
		return scannerDouble.nextDouble();
	}
}
