package CoreJava;

import java.util.Arrays;

public class ClassA087 
{
    int[] meth1() 
    {
        int arr[] = {8, 3, 2}; // Declare and initialize an array
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] == 3 && arr[i + 1] == 2) 
            { // Check if the current and next elements are 2 and 3, respectively
                arr[i+1] = 0; // Set the next element to 0
            }
        }
        return arr; // Return the modified array
    }

    public static void main(String[] args) 
    {
        ClassA087 obj = new ClassA087(); // Create an instance of ClassA087
        int result[] = obj.meth1(); // Call meth1() and store the returned array in result
        System.out.println(Arrays.toString(result)); // Print the elements of the result array
    }
}
