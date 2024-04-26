package CoreJava;

public class ClassA163 
{
	void print()
	{
		System.out.println("I am in the print method of outerclass");
	}
	public static void main(String[] args) 
	{
		ClassA163 o = new ClassA163()
				{
			void print()
			{
				System.out.println("java is awesome");
			}
				};
				o.print();
	}

}
