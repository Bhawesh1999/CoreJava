package CoreJava;

public class ClassA071 
{
    void display() 
    {
        int a = 10;
        // The following line has complex expressions and control flow within the for loop
        for (int k = (a++ + new ClassA071().meth1(5)) + (++a + 3); k > 10; k++) 
        {
            System.out.println(k + 6);
            break;
        }
        // The loop prints the value of k + 6 and breaks the loop after the first iteration
    }

    int meth1(int a) 
    {
        return new ClassA071().meth2(10 + 1, 15 - 3) + (a * 2);
        // Calls meth2 method with arguments and returns the result, which is used in the calculation
    }

    int meth2(int a, int b) 
    {
        return a + b;
        // Returns the sum of the two arguments
    }

    public static void main(String[] args) 
    {
        ClassA071 a = new ClassA071();
        a.display();
        // Create an object of ClassA071 and call the display method
    }
}
