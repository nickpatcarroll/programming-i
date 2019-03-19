package lab5;
/* Nicholas Carroll			27 November 2018
 * LAB5 - Convert a phone number with letters on a phonepad to all numbers
 */

import java.util.Scanner;
import java.lang.Character;			// Character functions will be used in this program.

public class PhonePadLettersToNumbers
{
    private static Scanner input;		// Written outside the main program so we can encapsulate our scanner variable.

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        
        System.out.println("Enter the phone numbers with letters: ");
        
        String initialPhoneNumber = input.nextLine();

        initialPhoneNumber = initialPhoneNumber.toUpperCase();
        
        long finalPhoneNumber = fullNumber(initialPhoneNumber);

        System.out.printf("The phone number in full numbers for '%s' is '%s'",
                initialPhoneNumber, finalPhoneNumber);
    }

    public static long fullNumber(String initialPhoneNumber)
    {
        // Use long data type as int can only accept up to 9 digits
        long number = 0;
        
        int stringLength = initialPhoneNumber.length();
        
        for (int currentCharacter = 0; currentCharacter < stringLength; currentCharacter++) 
        {		// The for loop is necessary so that the program will convert characters to numbers for as many inputs the user provides.
            char ch = initialPhoneNumber.charAt(currentCharacter);

            if (Character.isLetter(ch)) 
            {
                switch(ch)
                {
                case 'A' : 
                case 'B' : 
                case 'C' : number *= 10; number += 2; 
                break;
                
                case 'D' : 
                case 'E' : 
                case 'F' : number *= 10; number += 3; 
                break;
                
                case 'G' : 
                case 'H' : 
                case 'I' : number *= 10; number += 4; 
                break;
                
                case 'J' : 
                case 'K' : 
                case 'L' : number *= 10; number += 5; 
                break;
                
                case 'M' : 
                case 'N' : 
                case 'O' : number *= 10; number += 6; 
                break;
                
                case 'P' : 
                case 'Q' : 
                case 'R' : 
                case 'S' : number *= 10; number += 7; 
                break;
                
                case 'T' : 
                case 'U' : 
                case 'V' : number *= 10; number += 8; 
                break;
                
                case 'W' : 
                case 'X' : 
                case 'Y' : 
                case 'Z' : number *= 10; number += 9; 
                break;
                }		// End of case/break
            }		// End of first if
            else if (Character.isDigit(ch))
            {
                number *= 10; number += Character.getNumericValue(ch);
            }		// End of second if
        } // End of for loop

        // Return actual number only at the end of the function
        return number;

    }// End of fullNumber function    
}// End of class