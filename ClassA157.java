package CoreJava;

import java.util.Optional;

public class ClassA157 
{
	void meth1()
	{
		int s = 4; 
		String arr[] = new String[s];
		arr[1]="Kishan";
		arr[2]="Java";
		
		System.out.println(arr[3].toUpperCase());
		
		Optional<String> o = Optional.ofNullable(arr[3]);
		System.out.println(0);
		
		if(o.isPresent())
		{
			System.out.println("data is present ");
			System.out.println(o.get());
		}
		else
		{
			System.out.println("its empty");
		}
		
	}
	public static void main(String[] args) {
		new ClassA156().meth1();
	}

}
