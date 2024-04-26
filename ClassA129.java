package CoreJava;

public class ClassA129 extends Exception
{
	String message;
	
	public ClassA129(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return message;
	}
	

}
