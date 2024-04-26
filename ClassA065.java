package CoreJava;

public class ClassA065 
{
	void meth1(char operator, int num1, int num2)
	{
		switch(operator)
		{
		case '+':
			System.out.println("Addition"+(num1+num2));
			break;
		case'-':
			System.out.println("substraction"+(num1-num2));
			break;
		case'/':
			System.out.println("Division"+(num1/num2));
			break;
		case'*':
			System.out.println("multiplication"+(num1*num2));
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}
	public static void main(String[] args) {
		new ClassA065().meth1('+', 99, 1);
	}

}
