package CoreJava;

public class ClassA102 
{
	public String firstTwo(String str)
	{
		if(str.length()>=2)
			return str.substring(0,2);
		return str;
	}
	public static void main(String[] args) {
		ClassA102 obj = new ClassA102();
		String result = obj.firstTwo("Java");
		System.out.println(result);
	}

}
