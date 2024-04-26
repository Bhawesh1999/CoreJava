package CoreJava;

import java.util.Arrays;

public class ClassA158 
{
	void meth1()
	{
		int arr[] = {1,5,7,3,9,2,6,8};
		for(int x :arr)
		System.out.println(x+"  ");
		System.out.println();
		Arrays.sort(arr);
		for(int x:arr)
			System.out.println(x+"  ");
		System.out.println();
		Arrays.parallelSort(arr,3,7);
		for(int x:arr)
			System.out.println(x+"  ");
		System.out.println();
	}
	public static void main(String[] args) {
		ClassA158 bobj = new ClassA158();
		bobj.meth1();
	}

}
