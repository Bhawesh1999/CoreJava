package CoreJava;

public class ClassA069 
{
	void meth1()
	{
		for(int i=1; i<10; i++)
		{
			if(i==5)
			{
				//break;
				//continue;
				return;
			}
			System.out.println("i value "+i);
		}
		System.out.println("compiler come out from for loop");
			
		}
	public static void main(String[] args) 
	{
		System.out.println("start");
		new ClassA069().meth1();
		//break;
		//continue;
		System.out.println("End");
		
	}
	}