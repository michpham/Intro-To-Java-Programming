package areaandperimeter;

/**
 * Name: Michael Pham
 * Date: 10/2/18
 * Instructor: Rachel Hurt
 */
public class AreaAndPerimeter 
{

   // program that displays area and perimeter of a circle with radius 5.5
    public static void main(String[] args) 
    {
        final double RADIUS = 5.5;
        final double PI = 3.14;
        double area, perimeter;
        
        perimeter = 2 * RADIUS * PI;
        area = RADIUS * RADIUS * PI;
        
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    }
    
}
