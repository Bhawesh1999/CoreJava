package CoreJava;

public class ClassA104 
{
	void meth1()
	{
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("Capacity() :"+buffer1.capacity());
		buffer1.append("abc");
		System.out.println("capacity()"+buffer1.capacity());
		System.out.println("length()"+buffer1.length());
		
		buffer1.append("defghikjlmnopq");
		System.out.println("buffer:"+buffer1);
		System.out.println("capacity()"+buffer1.capacity());
		System.out.println("length()"+buffer1.length());
		System.out.println(buffer1.reverse());
		System.out.println(buffer1);
		System.out.println(buffer1.charAt(buffer1.length()-1));
		
		
	}
	public static void main(String[] args) {
		ClassA104 obj = new ClassA104();
		obj.meth1();
	}

}
