package CoreJava;

import java.util.PriorityQueue;

public class ClassA148 
{
	void meth1()
	{
		System.out.println("Implementing Queue");
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add(10);//insertion order is not maintained but always the first
									//element will be the smallest element
		//pq.offer("java");//heterogeneous data is not allowed
		//pq.add(null);//null is not allowed
		pq.add(100);//Duplicates are allowed
		pq.add(85);//it is available from java1.5
		pq.add(10);//its size increases by double
		pq.add(99);//it is not synchronized
		pq.add(8);
		System.out.println(pq);
		System.out.println("remove() :"+pq.remove());
		System.out.println(pq);
		System.out.println("poll() :"+pq.poll());
		System.out.println(pq);
	//	pq.clear();
		System.out.println("remove() :"+pq.remove());
		
		System.out.println("poll() :"+pq.poll());
		System.out.println("peek() :"+pq.peek());
		System.out.println(pq);
	}
	public static void main(String[] args) 
	{
		new ClassA148().meth1();
	}

}
