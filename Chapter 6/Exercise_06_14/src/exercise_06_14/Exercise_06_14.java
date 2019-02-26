/*
Name: Michael Pham
Date: 11/07/2018
Instructor: Rachel Hurt
Program that displays m(i) given i
*/
package exercise_06_14;

public class Exercise_06_14 
{

    /*
        Main method
    */
    public static void main(String[] args) 
    {
        // displays headers
        System.out.println("i\t    m(i)");
        System.out.println("__________________");
        
        // increments i by 100 until 901
        for(double i = 1; i <= 901; i +=  100)
        {
            System.out.printf("%-12.0f", i); // prints out i 
            System.out.printf("%-6.4f\n", estimatePI(i)); // prints out estimated amount of pi
        }     
    }
    
    /*
        Method that take in i
        and then calculates pi(m(i))
    */
    public static double estimatePI(double i)
    {
        double sum = 0.0;
        for (int n = 1; n <= i; n++)
        {
         sum += Math.pow(-1, n + 1) / (2 * n - 1);
        }
        return sum * 4;
    }
}
    
