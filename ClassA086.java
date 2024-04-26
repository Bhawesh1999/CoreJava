package CoreJava;

public class ClassA086 
{
    int[] meth1(int arr[]) 
    {
        System.out.println("meth1()");
        return arr; // Return the input array
    }

    public static void main(String[] args) 
    {
        int input[] = {10, 20, 30}; // Declare and initialize an array
        int result[] = new ClassA086().meth1(input); // Call meth1() and store the returned array in result
        for (int i = result.length - 1; i >= 0; i--) 
        { // Iterate over the elements of result in reverse order
            System.out.println(result[i] + " "); // Print each element followed by a space
        }
    }
}
