package exercise_02_07;
import java.util.Scanner;

/**
 * Name: Michael Pham
 * Instructor: Rachel Hurt
 * Date: 10/08/2018
 */
public class Exercise_02_07 
{

    public static void main(String[] args) 
    {
        int minutes, years, days;
        
       Scanner input = new Scanner(System.in);
       
       // Prompt user for amount of minutes
       System.out.print("Enter the numbers of minutes: ");
       minutes = input.nextInt();
       
       // Compute number of years and days
       years = minutes / 525600;
       days = (minutes % 525600) / 1440;
       
       // Display results
       System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
               
    }
    
}
