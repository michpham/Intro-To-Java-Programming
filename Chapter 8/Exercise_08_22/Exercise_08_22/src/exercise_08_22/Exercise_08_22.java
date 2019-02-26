/*
Name: Michael Pham
Date: 12/07/2018
Instructor: Rachel Hurt
Program that makes a 6 by 6 two-dimensional matrix filled with 0s and 1s
display sthe matrix, and checks if every column has an even number of 1s
*/
package exercise_08_22;

public class Exercise_08_22 
{

    /*
     * Main method
     */
    public static void main(String[] args) 
    {
        
        int[][] matrix = new int[6][6];
        
        fillMatrix(matrix);
        print(matrix);
        if(checkEqual(matrix))
            System.out.println("All matrices have even ones.");
        else
            System.out.println("Not all matrices have even ones.");
        
    }
    
    /*
    * Method that randomly fills matrix with 0s and 1s
    */
    public static void fillMatrix(int[][] matrix)
    {
        for(int x = 0; x < matrix.length; x++) // row
        {
            for(int y = 0; y < matrix.length; y++) // column
            {
                matrix[x][y] = (int)(Math.round(Math.random()));
            }
        }
    }
    
    /*
    * Prints out the random set of 1s and 0s
    */
    public static void print(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++) // row
        {
            for(int z = 0; z < matrix.length; z++) // column
            {            
                System.out.print(matrix[i][z]);
                
                if(z == matrix.length - 1) // creates new after 6 on 1 line
                    System.out.print("\n");
                else
                    System.out.print(",");
            }
        }
    }
    
    /*
    * Checks if there's an even amount of 1s in each row
    */
    public static boolean checkEqual(int[][] matrix)
    {
        int oneCount = 0;
        boolean equal = false;
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int x = 0; x < matrix[i].length; x++)
            {
                if(matrix[i][x] == 1) // checks for 1s
                    oneCount++;
            }
            
            if(oneCount % 2 != 0) // row isn't even
                return false;
           
            oneCount = 0; // resets for each row
        }
        
        return true;    // all rows are even   
    }
}
