package CoreJava;

import java.util.Arrays;

public class ClassA093 {
	
	// A method named "middleway" that takes two arrays of integers as input and returns an array of integers
	public int[] middleway(int[] a, int[] b) {
		return new int[] {a[1], b[1]};
	}
	
	public static void main(String[] args) {
		ClassA093 obj = new ClassA093();
		
		// Create two arrays: input1 with elements 4, 5, 6, and input2 with elements 40, 9, 6
		int input1[] = {4, 5, 6};
		int input2[] = {40, 9, 6};
		
		// Call the "middleway" method on the "obj" instance, passing the "input1" and "input2" arrays as arguments,
		// and store the returned array in the "result" variable
		int result[] = obj.middleway(input1, input2);
		
		// Print the array elements using Arrays.toString() method
		System.out.println(Arrays.toString(result));
	}
}
