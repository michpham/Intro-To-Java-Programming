package exercise_10_14;
import java.util.GregorianCalendar;

public class MyDate 
{
    // Data fields
    private int year;
    private int month;
    private int day;
    
    // Constructors
    // Creates object for current date
    MyDate()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    // Creates object with specified time since midnight, January 1, 1970 in miliseconds
    MyDate(long elapsedTime)
    {
        setDate(elapsedTime);
    }
    
    // Creates object with specified year, month, and day
    MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // Getter methods
    // Returns year
    public int getYear()
    {
        return year;
    }
    
    // Returns month
    public String getMonth()
    {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }
    
    // Returns day
    public String getDay()
    {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }
    
    // Method
    // Sets a new date for the object using the elapsed time
    public void setDate(long elapsedTime)
    {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
