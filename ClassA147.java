package CoreJava;

import java.util.LinkedList;
import java.util.List;

public class ClassA147 
{
    void meth1()
    {
        List<Object> ll1 = new LinkedList<Object>();
        LinkedList<Object> ll2 = new LinkedList<Object>();
        
        ll1.add(10);
        // ll1.after(20); - This line is commented out because there is no "after" method in the List interface or LinkedList class.
        System.out.println(ll1);
        
        ll2.add(100);
        //ll2.after(200); - This line is also commented out for the same reason.
        System.out.println(ll2);
    }

    public static void main(String[] args) 
    {
        new ClassA147().meth1();
    }
}
