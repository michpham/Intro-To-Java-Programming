/*
* Name: Michael Pham
* Date: 11/01/2018
* Instructor: Rachel Hurt
* Program that displays a table of feet and meters
*/
package exercise_06_09;

public class Exercise_06_09 
{
    
    public static void main(String[] args) 
    {    
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("_____________________________________");
        
        double meters = 20.0; // presets meter to 20
        
        // runs and increments "feet"
        for(double x = 1.0; x <= 10.0; x++)
        {
            // gets and prints info
            System.out.println(x + "\t" + footToMeter(x) + "\t|\t" + meters + "\t" + meterToFoot(meters));
            meters += 5;
        }
    } 
    
    // method to compute the amount of meters
    public static double footToMeter(double foot)
    {
        double meter = 0.305 * foot;
        return meter;
    }
    
    // method to compute the amount fo feet
    public static double meterToFoot(double meter)
    {
        double foot = 3.279 * meter;
        return foot;
    }
}
