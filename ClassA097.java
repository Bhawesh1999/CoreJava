package CoreJava;

public class ClassA097 
{
	public String makeAbba(String a, String b, String c, String d)
	{
	return a+b+c+d;
	//return a.concat(b).concat(c).concat(d);
	}
public static void main(String[] args) 
{
	ClassA097 obj = new ClassA097();
	String result = obj.makeAbba("Hi","Bye","Bye","Hi");
	System.out.println(result);
	
}}
