package CoreJava;

public class ClassA059 
{
    // Method that takes three integers as parameters
    void meth1(int a, int b, int c) {
    	if(a>b) {
    		if(c>a) {
    			System.out.println("c is greater than a");
    		}
    		else
    			System.out.println("a is greater than c");
    	}
    	if(b>c)
    	{
    		if(a>b) {
    			System.out.println("a is greater than b");
    		}
    		else {
    			System.out.println("b is greater than b");
    		}
    	}
    }

    public static void main(String[] args) {
        ClassA059 obj = new ClassA059(); // Create an object of ClassA059
        obj.meth1(10, 5, 7); // Call meth1 method with arguments 10, 5, and 7
    }
}
