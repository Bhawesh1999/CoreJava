package CoreJava;

import java.util.Arrays;

public class ClassA091 {
	
	// A method named "makePi" that returns an array of integers
	public int[] makePi() {
		return new int[] {3, 4, 1};
	}
	
	public static void main(String[] args) {
		ClassA091 obj = new ClassA091();
		
		// Call the "makePi" method on the "obj" instance and store the returned array in "result"
		int[] result = obj.makePi();
		
		// Print the array elements using Arrays.toString() method
		System.out.println(Arrays.toString(result));
	}
}
