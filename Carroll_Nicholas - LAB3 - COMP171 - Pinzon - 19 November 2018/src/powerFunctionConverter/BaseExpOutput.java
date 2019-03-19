/*		Nicholas Carroll			19 November 2018
 * 	Write a Java program to print a table based on power function values 
 */
package powerFunctionConverter;
import java.util.Scanner;
import java.lang.Math;
public class BaseExpOutput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;			// base
		int b = 0;			// exponent
		int loopcount = 4;
		returnPowFuncValue(a, b, loopcount, input);		// declaring arguments

	}				// end of main program

	public static int returnPowFuncValue(int a, int b, int loopcount, Scanner input) {		// creating for loop and declaring parameters
		for(int i = 0; i < loopcount; i++) {		// program will explicitly run 4 times
			System.out.println("Enter a:");
			a = input.nextInt();		// notice that I am not redeclaring an object for memory purposes
			System.out.println("Enter b:");
			b = input.nextInt();
			System.out.println("The value of a times the power of b is " + Math.pow(a, b));			// a times the power of b will equal x
		}		// end of for loop
	return 0;
	}		// end of returnPowFuncValue program

}		// end of class
