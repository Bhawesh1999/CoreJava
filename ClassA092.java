package CoreJava;

public class ClassA092 {
	
	// A method named "CommonEnd" that takes two arrays of integers as input and returns a boolean value
	public Boolean meth1(int[] a, int[] b)
	{
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1])
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		int[] input1 = {4,5,6};
		int[] input2= {6,5,4};
		
		ClassA092 obj = new ClassA092();
		Boolean result =obj.meth1(input1, input2);
		System.out.println(result);
		
		
		
		
		
	}
}
