package CoreJava;

public class ClassA070 
{
    void meth1(int b) 
    {
        int a = 10;
        while (a <= 20) 
        { // Execute the loop as long as 'a' is less than or equal to 20
            if (a == 15) 
            { // Check if 'a' is equal to 15
                while (b <= 30) 
                { // Execute the nested loop as long as 'b' is less than or equal to 30
                    if (b == 25) 
                    { // Check if 'b' is equal to 25
                        break; // Break the inner loop if 'b' is equal to 25
                    }
                    System.out.println("b value: " + b);
                    // Print the value of 'b'
                    b++;
                }
            }
            System.out.println("a value: " + a);
            // Print the value of 'a'
            a++;
        }
    }

    public static void main(String[] args) 
    {
        new ClassA070().meth1(4);
        // Create an anonymous object of ClassA070 and call meth1 method with argument 4
    }
}
