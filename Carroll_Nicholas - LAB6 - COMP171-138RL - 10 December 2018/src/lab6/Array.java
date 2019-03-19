//		Created by: Nicholas Carroll						10 December 2018
package lab6;

import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] num = new int[100]; 
        int [] count = new int[100];
        //Declare counter variable and temp variable that will temporarily hold the value at a certain index of num[] array
        
        int i, temp = 0;
        System.out.println("Enter the integers between 1 and 100: ");

        //Initialize num[] array with user input
        for(i=0; i < num.length; i++)		{
            num[i] = input.nextInt();
            //expected input will end when user enters zero
            if(num[i] == 0)		{
                break;
            }
        }				//end of for loop

        for(i = 0; i < num.length; i++){
                temp = num[i];
                count[temp]++;
            }//end of for looop

        for(i = 1; i < count.length; i++){

            if(count[i] > 0 && count[i] == 1){
             System.out.printf("%d occurs %d time %n",i, count[i]);
             }
            else if(count[i] >=2){
                System.out.printf("%d occurs %d times %n",i, count[i]);
            }

        }
    }
}
