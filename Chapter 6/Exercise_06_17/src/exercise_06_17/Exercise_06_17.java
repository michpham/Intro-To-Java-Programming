/*
Name: Michael Pham
Date: 11/07/2018
Instructor: Rachel Hurt
Program that prompts user for a number and displays a matrix
with that dimension with randomly generates numbers(0-1)
*/
package exercise_06_17;
import java.util.Scanner;

public class Exercise_06_17 
{
    /*
        Main method asks for a number and send to
        matrices method
    */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // prompts user for n
        System.out.print("Enter n: ");
        int n = input.nextInt();
         
        // sends n to getMatrices
        getMatrices(n);
    }
    
    /*
        Method that takes n
        and displays a matrix of 0 or 1
        according to n
    */
    public static void getMatrices(int n)
    {       
        // creates rows
        for(int x = 0; x < n; x++)
        {
            // creates characters in a row
            for(int y = 0; y < n; y++)
            {
                int number = (int)(Math.round(Math.random())); // generates 0 or 1
                System.out.print(number + " "); // prints number
            }
            System.out.print("\n"); // starts new row
        }
    }
    
}
