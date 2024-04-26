package CoreJava;

public class ClassA019 
{
	public String testMethod() {
		System.out.println(35);
		return new ClassA019().testMethod3(new ClassA019().testMethod2())+new ClassA019().testMethod4("Here");
	}
	public int testMethod2() {
		System.out.println(25);
		return 25+5;
	}
	public String testMethod3(int a)
	{
		System.out.println(15);
		return "is";	
	}
	public String testMethod4(String S) {
		System.out.println(45);
		return "awesome";
	}
	public static void main(String[] args) {
		ClassA019 t = new ClassA019();
		System.out.println("Java"+t.testMethod());
	}
}
