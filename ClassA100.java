package CoreJava;

public class ClassA100 
{
	void meth1(String word)
	{
		String rev =" ";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev = rev+word.charAt(i);
		}
		System.out.println("Original String :"+word);
		System.out.println("Reverse string :"+rev);
		
		if(word.equals(rev))
		{
			System.out.println(word+"is a palendrome");
		}
		else
		{
			System.out.println(word+"is not a palendrome");
		}
	}
	public static void main(String[] args) 
	{
		new ClassA100().meth1("MaDAm");
		
	}

}
