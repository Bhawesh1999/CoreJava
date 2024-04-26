package CoreJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class ClassA149 
{
    void meth1()
    {
        System.out.println("Implementing map interface");
        
       HashMap<Object, Object> map = new HashMap<Object, Object>();
       // LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();
        
        map.put(101, "java");//insertion order is maintained
        map.put("java", 1000);//Heterogeneous key and values are allowed
        map.put(null, null);//null key and values are allowed
        map.put(109, "CSS");//duplicates values are allowed
        map.put(105, "java");//its default capacity
        map.put(102, "HTML");//its size increases
        map.put(102,"Spring");
        
        System.out.println(map);
        System.out.println("--------");
        
        HashSet<Entry<Object, Object>> hs1 = new HashSet<Entry<Object, Object>>(map.entrySet());
        Iterator<Entry<Object, Object>> i2 = hs1.iterator();
        while(i2.hasNext())
        {
            Entry<Object, Object> entry = i2.next();
            System.out.println(entry);
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        System.out.println("-----------");
        
        LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(map.entrySet());
        Iterator<Object> i3 = lhs.iterator();
        while(i3.hasNext())
        {
            Entry  e2=(Entry)i3.next();
            System.out.println(e2.getKey() + " " + e2.getValue());
        }
    }
    
    public static void main(String[] args) 
    {
        new ClassA149().meth1();
    }
}
