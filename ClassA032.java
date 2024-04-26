package CoreJava;

public class ClassA032 
{
	ClassA032()
	{
		System.out.println("Student name is unknown");
	}
	ClassA032(String name)
	{
		System.out.println("Student name is "+name);	
	}
	public static void main(String[] args) 
	{
		new ClassA032();
		new ClassA032("Bhawesh");
		
	}
}
