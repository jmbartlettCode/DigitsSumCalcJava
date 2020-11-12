/*
 * Josh Bartlett
 * Purpose: To add the sum of the digits using a method
 * May 12, 2019
 * Bellevue University
 * sumOfDigits.java
 */

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        // Ask user for input, declare inputNum variable,
        // add user input to variable inputNum
        System.out.print("Enter an integer: ");
        long inputNum = input.nextInt();

        // Display result to output
        System.out.println(sumDigits(inputNum));
    }
    
    // Method for adding digits and returns the sum
    public static int sumDigits(long lg){
        
        // Declare length varaible, length of number added  
        // to varable length to use in for loop
        int length = Long.toString(lg).length();
        
        // Declare d variable for use in the for loop equation
        // to get the individual digits
        int d = 1;
        int result = 0;
        
        // for loop to get the individual digits and add them together
        for(int i = length; i >= 1; i--){
            long a = (lg / d) % 10;
            d = d * 10;
            result = (int) (result + a);
        }
        return result;
    }
    
}
