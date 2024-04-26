package CoreJava;

import java.util.Scanner;

public class ClassB105 
{
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		ClassA105 obj = new ClassA105();
		System.out.println("Please enter  your name");
		
		//obj.studentName =sc.next();
		obj.setStudentName(sc.next());
		
		System.out.println("please enter your ID");
		//obj.studentId = sc.nextInt();
		obj.setStudentId(sc.nextInt());
		
		System.out.println("data entered by user");
		
		System.out.println("student name :"+obj.getStudentName());
	
		System.out.println("studentId :"+obj.getStudentId());
		
		sc.close();
	}
	public static void main(String[] args) {
		new ClassB105().meth1();
	}
}
