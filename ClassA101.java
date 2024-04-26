package CoreJava;

public class ClassA101 
{
	public String extraEnd(String str)
	{
		String s = str.substring(4);
		return s+s+s;
	}
	public static void main(String[] args) {
		ClassA101 obj=  new ClassA101();
		String result = obj.extraEnd("NareshIT");
		System.out.println(result);
	}

}
