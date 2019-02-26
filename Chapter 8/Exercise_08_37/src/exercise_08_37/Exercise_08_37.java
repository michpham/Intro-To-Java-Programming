/*
 Name: Michael Pham
 Date: 12/10/2018
 Instructor: Rachel Hurt
 Program that
*/
package exercise_08_37;
import java.util.Scanner;

public class Exercise_08_37 
{
    /*
    * Main method
    */
    public static void main(String[] args) 
    {
        startGame();
    }
    
    public static void startGame()
    {
        Scanner input = new Scanner(System.in);
        
        for(int count = 0; count < 5; count++)
        {
            System.out.print("What is the capital of "  + getState(count) + "? ");
            String capital = input.nextLine();
            checkCapital(capital, count);
        }
    }  
    
    public static void checkCapital (String capital, int count)
    {
        String[] statesAndCapital = {
    }
}
