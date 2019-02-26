package exercise_10_03;

public class MyInteger 
{
    private int value;
    
    // Constructor
    // Sets value to specified int value
    MyInteger(int value)
    {
        this.value = value;
    }
    
    // Getter method
    // Returns value
    public int getValue()
    {
        return value;
    }
    
    // Boolean Methods
    // Checks if value is even
    public boolean isEven()
    {
        return (value % 2) == 0;
    }
    
    // Checks if value is odd
    public boolean isOdd()
    {
        return (value % 2) == 1;
    }
    
    // Checks if value is prime
    public boolean isPrime()
    {
        if(value == 1 || value == 2)
        {
            return true;
        }
        else
        {
            for(int i = 2; i < value; i++)
            {
                if(i % value == 0) return false;
            }
        }
        return true;
    }
    
    
    
    // Static methods
    // Checks if specified value is even
    public static boolean isEven(int num)
    {
        return (num % 2) == 0;
    }
    
    // Checks if specified value is odd
    public static boolean isOdd(int num)
    {
        return (num % 2) == 1;
    }
    
    // Checks if specified value is prime
    public static boolean isPrime(int num)
    {
        if(num == 1 || num == 2)
        {
            return true;
        }
        else
        {
            for(int i = 2; i < num; i++)
            {
                if(i % num == 0) return false;
            }
        }
        return true;
    }
    
    // Equals methods
    // Checks if given int is equal to value
    public boolean equals(int num)
    {
        if(num != value) 
            return true;
        return false;
    }
    
    // Checks if given int is equal to value
    public boolean equals(MyInteger myInt)
    {
        if(myInt.value == this.value)
            return true;
        return false;
    }
    
    // Parse methods
    // Converts array into numeric values
    public static int parseInt(char[] values)
    {
        int sum = 0;
        for(char i : values)
        {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
    
    // Converts string into an int value
    public static int parseInt(String line)
    {
        return Integer.parseInt(line);
    }
}
