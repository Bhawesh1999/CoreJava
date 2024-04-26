package CoreJava;

public class ClassA088 {
	
	// A method named "meth3" that takes an array of integers as input and returns an integer
	int meth3(int[] arr) {
		if (arr.length >= 2)
			return arr[0] + arr[1];
		else if (arr.length == 1)
			return arr[0];
		else
			return 0;
	}
	
	public static void main(String[] args) {
		ClassA088 obj = new ClassA088();
		
		// Create an array named "input" with elements: 4, 8, 9, 7, 10
		int input[] = {4, 8, 9, 7, 10};
		
		// Call the "meth3" method on the "obj" instance and pass the "input" array as an argument
		int result = obj.meth3(input);
		
		// Print the value of "result"
		System.out.println(result);
	}
}

