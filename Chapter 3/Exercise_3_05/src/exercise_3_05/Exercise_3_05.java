package exercise_3_05;
import java.util.Scanner;

/*
 * Name: Michael Pham
 * Instructor: Rachel Hurt
 * Date: 10/11/2018
*/
public class Exercise_3_05 
{

    public static void main(String[] args) 
    {
        int date, futureDate;
        String day = " ", futureDay = " ";
        
        Scanner input = new Scanner(System.in);
        
        // prompt user for current date and future date
        System.out.print("Enter today's day: ");
        date = input.nextInt();       
        System.out.print("Enter the number of days elapsed since today: ");
        futureDate = input.nextInt();
        
        // calculates what date the elapsed time inputted would fall into
        futureDate = (date + futureDate) % 7;
        
        // finds today's day
        switch(date)
        {
            case 0: day = "Sunday"; break;
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
        }
        
        // finds future day
        switch(futureDate)
        {
            case 0: futureDay = "Sunday"; break;
            case 1: futureDay = "Monday"; break;
            case 2: futureDay = "Tuesday"; break;
            case 3: futureDay = "Wednesday"; break;
            case 4: futureDay = "Thursday"; break;
            case 5: futureDay = "Friday"; break;
            case 6: futureDay = "Saturday"; break;
        }
        
        // displays statement
        System.out.println("Today is " + day + " and the future day is " + futureDay);
    }
    
}
