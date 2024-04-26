package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassA156 
{
	void meth1()
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(60);
		System.out.println(al);
		al.forEach(x->System.out.println(x));
		System.out.println("-----");
		System.out.println("before mapping"+al);
		Stream<Integer> s1 = al.stream();
		/*Stream<Integer> s2 = s1.map(data->data*2);
		list li = s2.collect(Collectors.toList());*/
		List li = al.stream().map(data->data*2).collect(Collectors.toList());
		System.out.println("aftre maaping :"+li);
		Collections.sort(li);
		//List li2 = (List)li.stream().sorted.Collect(Collectors.toList());
		System.out.println("Aftersorting :"+li);
	}
	void meth2()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Kishan");
		al.add("Ravi");
		al.add("Ravi");
		al.add("Ahmed");
		al.add("Rachecl");
		al.add("John");
		al.add("Anand");
		/*Stream<String> s1 = al.stream();
		Stream<String> s2 = s1.filter(data ->data.length()<=4);
		long l = s2.count();*/
		long l = al.stream().filter(data->data.length()<=4).count();
		System.out.println("There are "+l+"elements whose length is <=4");
	}
public static void main(String[] args) {
	ClassA156 obj = new ClassA156();
	obj.meth1();
	obj.meth2();
}
}
