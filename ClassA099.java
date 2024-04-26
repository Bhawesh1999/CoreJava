package CoreJava;

public class ClassA099 
{
	public String makeOutWord(String out, String word)
	{
	return out.substring(0,2) +word +out.substring(2);
}
public static void main(String[] args) {
	ClassA099 obj = new ClassA099();
	String result = obj.makeOutWord("<<>>", "Kishan");
	System.out.println(result);
}
}
