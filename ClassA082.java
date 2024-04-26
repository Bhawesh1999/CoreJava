package CoreJava;

public class ClassA082 
{
    public int meth1(int a, int b) 
    {
        System.out.println("meth1() called"); // Print a message
        System.out.println(b); // Print the value of b
        System.out.println(100); // Print the value 100
        return (a + b) + 10 + (a - b); // Return the sum of a, b, and some additional calculations
    }
    
    public int meth2() 
    {
        System.out.println("meth2() called"); // Print a message
        return this.meth3() + 8; // Return the result of meth3() plus 8
    }
    
    public ClassA082() 
    {
        this("Java is awesome"); // Call the constructor with a String parameter
        System.out.println(50); // Print the value 50
    }
    
    int meth3() 
    {
        System.out.println("meth3() called"); // Print a message
        return 10; // Return the value 10
    }
    
    public String meth4(int a, String S) 
    {
        System.out.println("meth4 called"); // Print a message
        a = a + 4; // Add 4 to the value of a
        System.out.println("a value: " + a); // Print the updated value of a
        System.out.println("s value: " + S); // Print the value of S
        return S + " is object-oriented programming"; // Concatenate S with a message and return it
    }
    
    public int meth5(int a) 
    {
        System.out.println("meth5() called"); // Print a message
        return 10 - a; // Return the difference between 10 and a
    }
    
    public ClassA082(String S) 
    {
        String result = this.meth4(this.meth1(this.meth2(), this.meth5(5) + 'A' - ('a')), "Java");
        // Call meth2, meth5, and calculate an expression using 'A' and 'a'
        // Pass the results to meth1 and meth4, and assign the returned value to result
        // Pass "Java" as a parameter to meth4
        System.out.println(result); // Print the value of result
        System.out.println(S); // Print the value of S
    }
    
    public static void main(String[] args) 
    {
        new ClassA082(); // Create an instance of ClassA082
    }
}
