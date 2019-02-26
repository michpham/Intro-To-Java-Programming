/*
    Name: Michael Pham
    Date: 1/8/2019
    Instructor: Rachel Hurt
    Program: Date
*/

package exercise_09_03;

public class Exercise_09_03 
{   
    /*
       Main method
    */
    public static void main(String[] args) 
    {
        java.util.Date date = new java.util.Date(); // creates a date object
        
        System.out.println("The dates and times for elapsed times 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000, respectively:");
        System.out.println();
        for(long i = 10000; i <= 1e11; i *= 10)
        {
            date.setTime(i);
            System.out.println(date.toString());
        }
    } 
}
