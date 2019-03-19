/* 
 * created by: Nicholas Carroll
 * 17 December 2018
 * COMP171-800RL
 * Professor Pinzon
 */
package lab8;
import java.util.Scanner;


public class statesArray {
static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {

       int correctStates1 = 0;
       int correctStates2 = 0;
       String userInput = "";
       final int numberOfStates1 = 25;
       final int numberOfStates2 = 25;

       String capitals1 [][] = {
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahasse"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Indiana", "Indianapolis"},
        {"Iowa", "Des Moines"},
        {"Kansas", "Topeka"},
        {"Kentucky", "Frankfort"},
        {"Louisiana", "Baton Rouge"},
        {"Maine", "Augusta"},
        {"Maryland", "Annapolis"},
        {"Massachusettes", "Boston"},
        {"Michigan", "Lansing"},
        {"Minnesota", "Saint Paul"},
        {"Mississippi", "Jackson"},
        {"Missouri", "Jefferson City"},
       };
       
       String capitals2 [][] = {
        {"Montana", "Helena"},
        {"Nebraska", "Lincoln"},
        {"Nevada", "Carson City"},
        {"New Hampshire", "Concord"},
        {"New Jersey", "Trenton"},
        {"New York", "Albany"},
        {"New Mexico", "Santa Fe"},
        {"North Carolina", "Raleigh"},
        {"North Dakota", "Bismark"},
        {"Ohio", "Columbus"},
        {"Oklahoma", "Oklahoma City"},
        {"Oregon", "Salem"},
        {"Pennslyvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}
       };
       
       int index = 0;

       for(index = 0; index < numberOfStates1; index++){  
           System.out.println("Enter the Capital of the State listed: " + capitals1[index][0]);
           userInput = scanner.next();
       if(capitals1[index][1].equals(userInput)) {
           correctStates1++;
           System.out.println("Yes that is the capital of " + capitals1[index][0] + ".");

       }

       else {
           System.out.println("No that is not the capital of " + capitals1[index][0] + ".");
           index++;
       }
       }
       
       System.out.println("Let's take a break");
       System.out.println("Please type 'Continue' when ready");
       
       scanner.nextLine();
       
       if(scanner.nextLine().equals("Continue"))	{
           for(index = 0; index < numberOfStates2; index++){  
               System.out.println("Enter the Capital of the State listed: " + capitals2[index][0]);
               userInput = scanner.next();
           if(capitals2[index][1].equals(userInput)) {
               correctStates2++;
               System.out.println("Yes that is the capital of " + capitals2[index][0] + ".");

           }

           else {
               System.out.println("No that is not the capital of " + capitals1[index][0] + ".");
               index++;
           }
           }
       }
       
       else	{
    	   System.out.println("End of game.");
       }


       //counts the number of correct guesses.
       System.out.println("Total number of capitals answered correctly: " + correctStates1 + correctStates2 + ".");
       index++;


     return;

   }
   
 
}