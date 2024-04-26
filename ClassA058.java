package CoreJava;

public class ClassA058 
{
    // Method that takes three integers as parameters and returns a boolean value
    boolean meth1(int a, int b, int c) 
    {
        if (a > 5) 
        { // Check if 'a' is greater than 5
            if (b < 5) 
            { // Check if 'b' is less than 5
                if (c == 5) 
                { // Check if 'c' is equal to 5
                    return true; // If all conditions are true, return true
                } else 
                {
                    return false; // If 'c' is not equal to 5, return false
                }
            } else 
            {
                return true; // If 'b' is not less than 5, return true
            }
        } else 
        {
            return false; // If 'a' is not greater than 5, return false
        }
    }

    public static void main(String[] args) 
    {
        ClassA058 obj = new ClassA058(); // Create an object of ClassA58
        System.out.println(obj.meth1('a' - 50, 'A' - 'B', 5));
        // Call meth1 method with arguments 'a' - 50, 'A' - 'B', and 5,
        // and print the returned value to the console
    }
}
