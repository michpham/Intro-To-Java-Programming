/*
* Name: Michael Pham
* Date: 10/27/2018
* Instructor: Rachel Hurt
* Program that asks user for 2 names and scores from each student
* and then displays the ranking accordingly
*/
package exercise_05_09;
import java.util.Scanner;

public class Exercise_05_09 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of students: ");
        int students = input.nextInt();
        
        System.out.println();
       
        double highestScore = 0,
               secondHighestScore = 0;
        String highestName = " ",
               secondHighestName = " ";
        
        for(int x = 0; x < students; x++)
        {
            System.out.print("Enter student " + (x + 1) + "'s name: "); // x + 1 because student 0 makes no sense 
            String name = input.next(); 
            
            System.out.print("Score: ");
            double score = input.nextDouble();
            
            // initializes the highestscore and highestname on the first run
            if(x == 0)
            {
                highestScore = score;
                highestName = name;
            }
            // score inputted is higher than highest score
            else if(score > highestScore)
            {
                highestScore = score;
                highestName = name;
            }
            // score isn't higher than highest score but is higher than second score
            else if(score > secondHighestScore)
            {
                secondHighestScore = score;
                secondHighestName = name;
            }
            
            System.out.println();
        }
        
        System.out.println(highestName + ": " + highestScore + "%");
        System.out.println(secondHighestName + ": " + secondHighestScore + "%");
    }
    
}
