package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ClassA150 
{
	void meth1() {
		System.out.println("Impelementing map interface");
		TreeMap<Object,Object> map =new TreeMap<Object,Object>();
		map.put(101, "java");//insertion order is maintained
		map.put(500,1000);//heterogenous keys are not allowed but heterogenous values are allowed
		map.put(104, null);//null keys are not allowed but null values are allowed
		map.put(109, "css");//duplicated values are allowed
		map.put(105, "java");//its default capacity 1.2
		map.put(102, "html");//its size increase by double
		map.put(102, "spring");//it is not synchronized
		System.out.println(map);
		System.out.println("-----------");
		ArrayList<Object> ts = new ArrayList<Object>(map.entrySet());
		Iterator<Object> i = ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
	public static void main(String[] args) {
		new ClassA150().meth1();
	}

}
