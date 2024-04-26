package CoreJava;

public class ClassA095 
{
	void meth1()
	{
		System.out.println("implementing string class method");
		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		String s4 =new String("java");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("java"));
		System.out.println(s1.equals("jAvA"));
		System.out.println(s1.equalsIgnoreCase("JAvA"));
		System.out.println(s1.equals("Javaa"));
		System.out.println("Java ".equals("Java"));
		System.out.println("------");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==new String("Java"));
		System.out.println(s4=="Java");
		System.out.println(s1=="Java");
		System.out.println("java"=="java");
		System.out.println(new String("java")==new String("java"));
	}
	public static void main(String[] args) {
		new ClassA095().meth1();
	}

}
