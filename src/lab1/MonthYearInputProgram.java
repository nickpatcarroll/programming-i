/**
 * 
 */
package lab1;
/**
 * @author Nicholas Carroll		Date: 4 November 2018
 *
 */
import java.util.Scanner;			// Scanner allows user input

import java.time.YearMonth;			// time class was created in Java 8

public class MonthYearInputProgram {

	public static Scanner in = new Scanner(System.in);
	public static int daysInMonth;
	
	public static void main(String[] args) {
			boolean program = true;
			while(program == true)
			{
				
				System.out.println("Enter an year between 2000 and 2020: ");
				
				int year = in.nextInt();
				
				if(year >= 2000) {		// if year is 2000, it will run the following code
					
					if(year <= 2020) { 		
				
						System.out.println("Enter an month in integer format: ");
				
						int month = in.nextInt();
						
						if(month >= 1) {		// if year is 2000, it will run the following code
							
							if(month <= 12) { 	
				
								YearMonth yearMonthObject = YearMonth.of(year, month);
				
								daysInMonth = yearMonthObject.lengthOfMonth();
				
								System.out.println("Based on the data you entered, the number of days in " + month + " " + year + " are " + daysInMonth);
								
							}		// end of fourth if
							
							else {
								
								System.out.println("Invalid data.");
							
							}			// end of third if
					
					} // end of second if
					
					else {
						
						System.out.println("Invalid data.");
						
					}	
				
				} // end of first if
					
					else {
						
						System.out.println("Invalid data.");
						
				} 
				
			}			
		
	}				// end of boolean loop
	
	}			// end of main program		
}// end of class