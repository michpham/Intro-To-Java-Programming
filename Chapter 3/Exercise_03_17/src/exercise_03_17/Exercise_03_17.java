package exercise_03_17;
import java.util.*;

/*
 * Name: Michael Pham
 * Instructor: Rachel Hurt
 * Date: 10/11/2018
*/
public class Exercise_03_17 
{

    public static void main(String[] args) 
    {
        int number, compNumber;
        String statement;
        boolean isValid = false;
        String playerChoice = " ", compChoice = " ";
        
        // creating objects to allow input and make a random number
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // generates random number between 0-2
        compNumber = random.nextInt(2);
        
        // asks user for input
        System.out.print("scissor (0), rock (1), paper (2): ");
        number = input.nextInt();
        
        // assigns user's choice & checks if the number is valid
        switch(number)
        {
            case 0: playerChoice = "scissor"; isValid = true; break;
            case 1: playerChoice = "rock"; isValid = true; break;
            case 2: playerChoice = "paper"; isValid = true; break;
        }
        
        // assigns computer's choice
        switch(compNumber)
        {
            case 0: compChoice = "scissor"; break;
            case 1: compChoice = "rock"; break;
            case 2: compChoice = "paper"; break;
        }
        
        // if number is valid
        if(isValid)
        {
            // computes the winner
            statement = ((playerChoice.equals(compChoice)) ? playerChoice + " too. It is a draw" : 
                     ((playerChoice.equals("scissor") && compChoice.equals("paper")) || (playerChoice.equals("rock") && compChoice.equals("scissor")) || (playerChoice.equals("paper") && compChoice.equals("rock"))) ? playerChoice + ". You won" :
                      playerChoice + ". You lose"); 
        
            // displays statement
            System.out.println("The computer is " + compChoice + ". You are " + statement);
        }
        else // if number is valid displays an error
            System.out.print("Error! You inputted a wrong number! Try again!");
    }
    
}
