package exercise_02_05;
import java.util.Scanner;

/**
 * Name: Michael Pham
 * Instructor: Rachel Hurt
 * Date: 10/08/2018
 */
public class Exercise_02_05 
{
    
    public static void main(String[] args) 
    {
        double subtotal, gratuityRate, gratuity, total;
        
         Scanner input = new Scanner(System.in);

	 // Prompt the user to enter the subtotal and the gratuity rate
	System.out.print("Enter the subtotal and a gratuity rate: ");
	subtotal = input.nextDouble();
	gratuityRate = input.nextDouble();

	// Calculate gratuity and total
	gratuity = subtotal * (gratuityRate / 100);
	total = subtotal + gratuity;

	// Display results
	System.out.println("The gratuity is $" + gratuity +
        " and total is $" + total);
    }
    
}
