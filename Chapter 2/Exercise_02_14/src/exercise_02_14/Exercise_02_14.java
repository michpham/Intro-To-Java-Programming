package exercise_02_14;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Name: Michael Pham
 * Instructor: Rachel Hurt
 * Date: 10/08/2018
 */
public class Exercise_02_14 
{

    public static void main(String[] args) 
    {
        double pounds, inches, kilograms, meters, bmi;
        
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        
        // Prompt user for pounds and inches
        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();        
        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();
        
        // Converts pounds and inches into kilograms and inches and calculates BMI
        kilograms = pounds * 0.45359237;
        meters = inches * 0.0254;
        bmi = kilograms / (meters * meters);
        
        // Displays results
        System.out.println("BMI is " + decimalFormat.format(bmi));
    }
    
}
