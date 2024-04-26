package CoreJava;

public class ClassA098 
{
	public String helloName(String name)
	{
		return "Hello".concat(name).concat("I");
		//return "Hello" +name+ "!";
		//return "Hello".concat(name)+"!";
	}
	public static void main(String[] args) {
		ClassA098 obj = new ClassA098();
		String result =obj.helloName("Kishan");
		System.out.println(result);
	}

}
