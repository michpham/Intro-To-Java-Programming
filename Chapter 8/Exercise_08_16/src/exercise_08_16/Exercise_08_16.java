/*
Name: Michael Pham
Date: 12/07/2018
Instructor: Rachel Hurt
Program that takes a two dimension array and sorts it
in ascending order
*/

package exercise_08_16;

public class Exercise_08_16 
{

    /*
    *    Main method
    */
    public static void main(String[] args) 
    {
       int[][] matrix = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
       print(matrix); // prints original matrix
       
       sort(matrix); // sorts matrix
       print(matrix); // prints sorted matrix
    }
    
    /*
    * Prints out the matrix before and after sorting
    */
    public static void print(int[][] matrix) 
    {
        // prints out each element in the matrix
        for (int i = 0; i < matrix.length; i++) 
        {
            System.out.print(elemString(matrix[i]) + " ");
        }
        System.out.println();
    }

    /*
    * Formats string into point notation
    */
    public static String elemString(int[] elem) 
    {
        return "{" + elem[0] + ", " + elem[1] + "}"; // formats point / element
    }
    
    /*
    * Sorts out string into ascending order
    */
    public static void sort(int[][] m) 
    {
        boolean changed;

        do 
        {
            changed = false;
            for (int i = 0; i < m.length - 1; i++) 
            {
                if (m[i][0] >= m[i + 1][0]) 
                {
                    if(m[i][0] == m[i + 1][0] && m[i][1] < m[i + 1][1]) 
                    {
                        continue;
                    }    
                int[] temp = m[i];
                m[i] = m[i + 1];
                m[i + 1] = temp;
                changed = true; // confirms the array has been changed
            }
        }
    } 
    while (changed);
   }
}
