package CoreJava;

public class ClassA072 
{
    void display(int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.println("*");
                // Print a single asterisk on each iteration of the inner loop
            }
        }
    }

    public static void main(String[] args) 
    {
        ClassA072 obj = new ClassA072();
        // Create an object of ClassA072
        obj.display(5);
        // Call the display method with argument 5 to print the pattern
    }
}
