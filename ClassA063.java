package CoreJava;

public class ClassA063 
{
	void meth1(double marks)
	{
		if(marks<25.00)
		{
			System.out.println("student has got "+marks +"marks and agrade of F");
		}
		else if(marks>=25.00 & marks <45.00)
		{
			System.out.println("student has got "+marks +"marks and agrade of E");
		}
		else if(marks>=45.00 & marks <40.00)
		{
			System.out.println("student has got "+marks +"marks and agrade of D");
		}
		else if(marks>=50.00 & marks <60.00)
		{
			System.out.println("student has got "+marks +"marks and agrade of C");
		}
		else if(marks>=60.00 & marks <80.00)
		{
			System.out.println("student has got "+marks +"marks and agrade of B");
		}
		else
		{
			System.out.println("student has got "+marks +"marks and agrade of A");
		}
	}
	public static void main(String[] args) 
	{
		new ClassA063().meth1(40.00);
		
	}

}
