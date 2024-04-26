package CoreJava;

public class ClassA022 
{
	void meth1() {
		System.out.println("meth1() called");
	}
	protected void finalize() {
		System.out.println("Garbaze has been collected");
	}
	public static void main(String[] args) {
		ClassA022 obj1 = new ClassA022();
		ClassA022 obj2 = new ClassA022();
		
		System.out.println("obj1 hashcode : "+obj1.hashCode());
		System.out.println("obj2 hashcode : "+obj2.hashCode());
		System.out.println("----------");
		
		boolean flag1=obj1.equals(obj2);
		System.out.println("result is :"+flag1);
		
		boolean flag2 = obj2.equals(obj1);
		System.out.println("result is :"+flag2);
		
		boolean flag3 = obj2.equals(obj2);
		System.out.println("result is :"+flag3);
		
		System.out.println("Result is :"+obj1.equals(new ClassA022()));
		
		System.out.println("Resul is : "+new ClassA022().equals(new ClassA022()));
		
		System.out.println("Result is :"+obj2.equals(new ClassA022()));
		
		System.out.println("result is :"+new ClassA022().equals(obj2));
		
		System.out.println("----------");
		
		System.out.println();
	}

}
