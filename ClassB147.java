package CoreJava;

import java.util.PriorityQueue;

public class ClassB147 
{
    void meth1()
    {
        System.out.println("Implementing queue");
        PriorityQueue<Object> pq = new PriorityQueue<Object>();
        pq.add(10);
     //   pq.offer("java");
       // pq.add(null);
        pq.add(100);
        pq.add(85);
        pq.add(10);
        pq.add(99);
        pq.add(8);
        System.out.println(pq);
        System.out.println("remove():"+pq.remove());
        System.out.println(pq);
        System.out.println("poll() :"+pq.poll());
        System.out.println("remove() :"+pq.remove());
        System.out.println("poll() :"+pq.poll());
        System.out.println("peek() :"+pq.peek());
        System.out.println(pq);
    }
    
    public static void main(String[] args) 
    {
        new ClassB147().meth1();
    }
}
