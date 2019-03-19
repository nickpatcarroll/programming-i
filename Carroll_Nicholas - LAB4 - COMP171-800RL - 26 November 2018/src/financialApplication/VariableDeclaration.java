/*		Nicholas Carroll			26 November 2018
 * 	LAB4 - Write a method that computes future investment value at a given interest rate for a specified number of years  
 */
package financialApplication;
import java.util.Scanner;
import java.lang.Math;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate:");
		double yearlyInterestRate = enter.nextDouble() / 100;		// converting percentages to decimals
		
		double monthlyInterestRate = yearlyInterestRate / 12;
		
		System.out.println("Enter the investment amount in integer form with no commas or decimals:");
		int investmentAmount = enter.nextInt();		
		
		 futureInvestmentValue(yearlyInterestRate, investmentAmount, monthlyInterestRate,
				enter);		// declaring arguments

	}				// end of main program

	public static void futureInvestmentValue(double yearlyInterestRate, int investmentAmount, double monthlyInterestRate, 
			Scanner enter) {	// creating for loop and declaring parameters	
			
			System.out.printf ( "%s	%-20s		%n",  "Years", "Future Value" );
		
			
			for(int years = 1; years <= 30; years++) {
				double futureInvestmentEquation = (investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12));
				System.out.format ("%d	 %20.1f	%n",  years, futureInvestmentEquation );
				
			}

		}		// end of for loop
	
	}	// end of futureInvestmentValue program
		// end of class
