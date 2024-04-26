package CoreJava;

public class CLassA068
{
	void meth1()
	{
		int arr[] = {10,20,30,40,50};
		System.out.println("The first element in array:"+arr[0]);
		System.out.println("The first element in array:"+arr[1]);
		System.out.println("The first element in array:"+arr[2]);
		System.out.println("The first element in array:"+arr[3]);
		System.out.println("The first element in array:"+arr[4]);
		System.out.println("retrieving the data by using for loop");
		for(int i=0; i<=4;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Retrieving the data is a reverse order by using the loop");
		for(int i=4; i>0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("-----");
		for(int i=3; i>=1;i--)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("--");
		System.out.println("retrieiving the data by using each loop");
		
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) 
	{
	new CLassA068().meth1();	
	}
}
