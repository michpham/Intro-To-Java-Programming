/*
 * Name: Michael Pham
 * Instructor: Rachel Hurt
 * Date: 10/16/2018
 */

package exercise_04_13;
import java.util.Scanner;

public class Exercise_04_13 
{

    public static void main(String[] args) 
    {        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter grade: ");
        String gradeString = input.nextLine();
        char grade = gradeString.charAt(0);
        
        if(Character.isLetter(grade))
        {         
            switch(Character.toUpperCase(grade))
            {
                case 'A': 
                case 'E':
                case 'I':
                case 'O':
                case 'U': System.out.println(grade + " is a vowel"); break;
                default: System.out.println(grade + " is a consonant"); break;
            }
        }
        else
            System.out.println(grade + " is an invalid input");                   
            
    }
    
}
