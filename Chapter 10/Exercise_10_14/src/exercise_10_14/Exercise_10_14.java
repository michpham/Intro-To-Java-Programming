/*
Name: Michael Pham
Date: 01/15/2019
Instructor: Rachel Hurt
Program:
*/
package exercise_10_14;

public class Exercise_10_14 
{
    
    public static void main(String[] args) 
    {
        // Creates two date objects
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);    
       
        System.out.println("Date 1: " + date1.getMonth() + "/" +date1.getDay() + "/" +date1.getYear());
        System.out.println("Date 2: " + date2.getMonth() + "/" + date2.getDay() + "/" + date2.getYear());
    }
    
}
