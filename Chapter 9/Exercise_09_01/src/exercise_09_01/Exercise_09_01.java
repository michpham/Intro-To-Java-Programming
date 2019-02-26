/*
    Name: Michael Pham
    Date: 1/8/2019
    Instructor: Rachel Hurt
    Program: Rectangle
*/

package exercise_09_01;

public class Exercise_09_01 
{
    // initializing width and height
    public static double width;
    public static double height;
    
    /*
       Method that creates a default rectangle
    */
    public Exercise_09_01()
    {
        width = 1;
        height = 1;
    }
    
    /*
       Method that creates a rectangle based on dimensions given
    */
    public Exercise_09_01(double w, double h)
    {
        width = w;
        height = h;
    }
    
    /*
       Method that computes and returns area
    */
    public double getArea()
    {
        return width * height;
    }
    
    /*
       Method that computes and returns perimeter
    */
    public double getPerimeter()
    {
        return (width * 2) + (height * 2);
    }
    
    /*
       Main method
    */
    public static void main(String[] args) 
    {
        Exercise_09_01 rect1 = new Exercise_09_01(4, 40); // creating rectangle 1
        System.out.println("The area of a " + width + "x" + height + " rectangle is " + rect1.getArea() +
                           " and the perimeter is " + rect1.getPerimeter());
        
        Exercise_09_01 rect2 = new Exercise_09_01(3.5, 35.9); // creating rectangle 2
        System.out.println("The area of a " + width + "x" + height + " rectangle is " + (rect2.getArea() * 100) / 100 +
                           " and the perimeter is " + rect2.getPerimeter());
    }   
}
