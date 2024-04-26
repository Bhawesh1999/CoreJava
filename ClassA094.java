package CoreJava;

public class ClassA094 
{
	void meth1()
	{
		System.out.println("Implementing string handling");
		String s1 = "java";
		String s2 = new String("java");
		char arr[] = { 'j','a','v','a'};
		String s3 = new String(arr);
		String s4 = new String(arr,2,2);
		
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s3 :"+s3);
		System.out.println("s4 :"+s4);
		
		System.out.println("s2 lenght();"+s2.length());
		System.out.println("Thursday ".length());
		System.out.println("java is awesome ".length());
		
	}
	void meth2()
	{
		System.out.println("meth2() called");
		String s = "java";
		
		System.out.println("before concatenation:"+s);
		
		System.out.println("after concatenation s:"+s.concat(" is awesome"));
		s=s.concat("is awesome");
		System.out.println("s value :"+s);
	}
	public static void main(String[] args) 
	{
		ClassA094 obj = new ClassA094();
		obj.meth1();
		obj.meth2();
	}
}
