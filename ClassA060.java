package CoreJava;

public class ClassA060 
{
    // Method that takes two integers as parameters
    void meth1(int l, int b) 
    {
        if (l == b) // Check if 'l' is equal to 'b'
            System.out.println("if is a square");
            // If 'l' is equal to 'b', print "if is a square"
        else
            System.out.println("it is rectangle");
            // If 'l' is not equal to 'b', print "it is rectangle"
    }

    public static void main(String[] args) 
    {
        new ClassA060().meth1(50, 10);
        // Create an anonymous object of ClassA060 and call meth1 method with arguments 50 and 10
    }
}
