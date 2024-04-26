package CoreJava;

public class ClassA090 {
	
	// A method named "SameFirstLast" that takes an array of integers as input and returns a boolean value
	public boolean SameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		ClassA090 obj = new ClassA090();
		
		// Create an array named "input" with elements: 8, 9, 3, 3, 4
		int input[] = {8, 9, 3, 3, 4};
		
		// Call the "SameFirstLast" method on the "obj" instance and pass the "input" array as an argument
		boolean result = obj.SameFirstLast(input);
		
		// Print the value of "result"
		System.out.println(result);
	}
}
