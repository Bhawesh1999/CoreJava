package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA096 
{
	void meth1()
	{
		System.out.println("implementing string class methods");
		String s1 ="Java";
		String s2 = new String("java");
		System.out.println("lenght():"+s1.length());
		System.out.println("length();"+s1.concat("is awesome").length());
		
		System.out.println("concat(): "+s1.concat("is awesome"));
		System.out.println("s1: "+s1);
		System.out.println("charAt();"+s1.charAt(0));
		System.out.println("charAt();"+s1.charAt(s2.length()-1));
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your gender M/F");
		char gender =sc.next().charAt(0);
		System.out.println("user is :"+gender);
		
		System.out.println("StartsWith() :"+s1.startsWith("ja"));
		System.out.println("StartsWith()"+"java is awesome".startsWith(s2));
		System.out.println("startsWith() :"+s1.startsWith("Ja"));
		System.out.println("toLowerCase() :"+s1.toLowerCase());
		System.out.println("toUpperCase() :"+s1.toUpperCase());
		System.out.println("s1:" +s1);
		System.out.println("------");
		String s3 = "I love India";
		System.out.println("SubString() :"+s3.substring(7));
		System.out.println("substring() :"+s3.substring(2,6));
		System.out.println("-------");
		String s4 = "java";
		System.out.println("replace() :"+s4.replace('a','A'));
		String s5 = "Hello World";
		System.out.println("Length() :"+s5.length());
		System.out.println("trim() "+s5.trim().length());
		System.out.println("index of() "+s4.indexOf('a'));
		System.out.println("lastIndexof()"+s4.lastIndexOf('a'));
		String s6 = "ABCDEF";
		byte arr[] = s6.getBytes();
		System.out.println(Arrays.toString(arr));
		String s7 = "12-30-2023";
		String arr2[] =s7.split("-");
		System.out.println(Arrays.toString(arr2));
		String s8 = "java is awesome";
		String arr3[] = s8.split(" ");
		System.out.println(Arrays.toString(arr3));
		
	}
	public static void main(String[] args) {
		new ClassA096().meth1();
	}
}
