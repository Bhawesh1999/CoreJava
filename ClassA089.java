package CoreJava;

public class ClassA089 {
	public boolean meth1(int[] val) {
		if(val[0]==6)
		{
			return true;
		}
		return false;
	}
	
	// A method named "firstLast6" that takes an array of integers as input and returns a boolean value
	public static void main(String[] args) {
		int input[] = {6,5,4,3,2};
		
		ClassA089  obj = new ClassA089();
		boolean result =obj.meth1(input);
		System.out.println(result);
		}
}
