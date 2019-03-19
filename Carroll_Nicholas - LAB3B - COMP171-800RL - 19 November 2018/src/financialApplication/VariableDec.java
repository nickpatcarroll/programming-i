/*		Nicholas Carroll			19 November 2018
 * 	Write a Java program to print a table based on power function values 
 */
package financialApplication;
import java.util.Scanner;
import java.lang.Math;

public class VariableDec {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int loanPeriod = 0;			
		
		int loanAmount = 0;
		
		returnPowFuncValue(loanPeriod, loanAmount, input);		// declaring arguments

	}				// end of main program

	public static int returnPowFuncValue(int loanPeriod, int loanAmount, Scanner input) {	// creating for loop and declaring parameters
		
		for(double interestRate = .05; interestRate <= .08; interestRate += .0125) {		
			
			System.out.println("Enter the loan period in years:");
			loanPeriod = input.nextInt();		// notice that I am not redeclaring an object for memory purposes
			
			System.out.println("Enter the loan amount in integer form with no commas or decimals:");
			loanAmount = input.nextInt();
			
			double monthlyPaymentNum = (loanAmount * interestRate);
			
			double monthlyPaymentDenom1 = Math.pow(1 + interestRate, loanPeriod * 12);
			double monthlyPaymentDenom2 = (1 - (1 / (monthlyPaymentDenom1)));
			
			double monthlyPayment = (monthlyPaymentNum / monthlyPaymentDenom2);
			
			double totalPayment = (monthlyPayment * loanPeriod * 12);
			
			System.out.format("%-18s%-18s%-18s\n", "Interest Rate",
			"Monthly Payment", "Total Payment");
			
			System.out.format("%-18s%-18s%-18s\n", interestRate, Math.round(monthlyPayment * 100.0) / 100.0, Math.round(totalPayment * 100.0) / 100.0);

		}		// end of for loop
		
	return 0;
	
	}		// end of returnPowFuncValue program

}		// end of class
