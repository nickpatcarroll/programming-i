/*
 * Programmed by: Nicholas Carroll						22 December 2018
 * COMP171-800RL													Professor Pinzon
 */

package lab9;
import java.util.GregorianCalendar;

public class GetCurrentDate {
	
	public static void main(String[] args) {
		// Create a GregorianCalendar object, Oracle already created the constructor
		GregorianCalendar calender = new GregorianCalendar();

		System.out.print("Current date in month/day/year: ");
		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		// set elapsed time since January 1, 1970 to 1234567898765L
		calender.setTimeInMillis(1234567898765L);

		// display the year, month and day
		System.out.print("Elapsed time since January 1, 1970 set to " +
			"1234567898765L in format month/day/year: ");
		
		System.out.println(calender.get(calender.MONTH) + "/" +
			calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}
