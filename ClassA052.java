package CoreJava;

public class ClassA052 
{
	int c;
	static int e;
	ClassA052()
	{
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) 
	{
		int a =34;
		int b=21;
		new ClassA052().c=a++ + ++b;
		int d =--a + --b + new ClassA052().c--;
		e=a+ +b + +new ClassA052().c +d--;
		int f=-a + b-- +  -new ClassA052().c -d++;
		int sum = a+b + new ClassA052().c+d +e+f;
		System.out.println("sum="+sum);
		
	}

}
