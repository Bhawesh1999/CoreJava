package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA083 
{
	void meth1()
	{
		int arr1[];
		arr1 = new int[5];
		int arr2[] = new int[4];
		int arr3[]= {15,25,35,45,55,65};
		int arr4[] = new int[] {100,200,300};
		
		String S ="java";
		System.out.println("lenght of S "+S.length());
		System.out.println("length of arr1[]: "+arr1.length);
		System.out.println("length of arr2[] :"+arr2.length);
		System.out.println("length of arr3[] :"+arr3.length);
		System.out.println("length of arr4[] :"+arr4.length);
		System.out.println("--------");
		
		//Index position of an array is used to pass the value into the array and retrive the values from array
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("arr2:"+Arrays.toString(arr2));
		System.out.println("arr3:"+Arrays.toString(arr3));
		System.out.println("arr4:"+Arrays.toString(arr4));
		
		arr1[1]=20;
		arr1[3]=40;
		//arr1[5]=50;//It generate arrayindexoutof bounds exception
		
		System.out.println("----");
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("-------");
		System.out.println("passing user defined data into arr2");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter "+arr2.length +"int values");
		for(int i =0; i<=arr2.length-1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("arr2:"+Arrays.toString(arr2));
		System.out.println("--------");
		System.out.println("-------");
		
		System.out.println(arr1[0]);
		System.out.println("==>"+arr1[arr1.length-1]);
		System.out.println(arr1[arr1.length-2]);
		System.out.println(arr1[arr2.length-arr4.length]);
		System.out.println("==>"+arr3[arr1.length-arr2.length-1]);
		//System.out.println(arr4[arr4.length-('A'-'B')]);Arithmatic indexoutofbounde exception
		System.out.println("-----");
		System.out.println("-----");
		
		for(int i=arr3.length-1; i>=0;i--)
		{
			System.out.println(arr3[i]+ " ");
		}
		System.out.println();
		for(int x:arr3)
		{
			System.out.println(x +" ");
		}
		
	}
	public static void main(String[] args) {
		new ClassA083().meth1();
	}

}
