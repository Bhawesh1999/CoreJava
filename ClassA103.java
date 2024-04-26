package CoreJava;

public class ClassA103 
{
	void meth1()
	{
		String s1 = new String("java");
		String s2 = new String("java");
		
		StringBuffer buffer1 = new StringBuffer("java");
		StringBuffer buffer2 = new StringBuffer("Java");
		
		StringBuilder builder1 = new StringBuilder("java");
		StringBuilder builder2 = new StringBuilder("Java");
		
		System.out.println("--------equals()---------");
		
		System.out.println("string class");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("java"));
		System.out.println("Java".equals(s2));
		
		System.out.println("----------");
		System.out.println("StringBuffer");
		
		System.out.println(buffer1.equals(buffer2));
		System.out.println(buffer1.equals(new StringBuffer("Java")));
		System.out.println(new StringBuffer("JAva").equals(buffer2));
		
		System.out.println("-------");
		System.out.println("string builder");
		System.out.println(builder1.equals(builder2));
		System.out.println(builder1.equals(new StringBuilder("Java")));
		
		System.out.println("-------");
		System.out.println(s1==s2);
		System.out.println(buffer1==buffer2);
		
		System.out.println(builder1 ==builder2);
		
		System.out.println("------------");
		System.out.println("checking the contents present inside a string buffer and string builder");
		
		StringBuffer buffer3 = new StringBuffer("JAVA");
		
		System.out.println(buffer1.toString().equals(buffer2.toString()));
		System.out.println(buffer1.toString().equals(builder2.toString()));
		System.out.println(buffer1.toString().equals(buffer3.toString()));
		System.out.println(buffer1.toString().equalsIgnoreCase(buffer3.toString()));
		
		System.out.println("-----------");
		
		System.out.println("s1 before cocatination:"+s1);
		System.out.println(s1.concat(" is awesome"));
		System.out.println("s1.AfterConcatenation"+s1);
		System.out.println();
		
		System.out.println("buffer1 before appending:"+buffer1);
		System.out.println(buffer1.append("is awesome"));
		System.out.println("buffer1 after appending:"+buffer1);
		System.out.println();
		
		System.out.println("builfer 1 before appending:"+builder1);
		System.out.println(builder1.append("is awesome"));
		System.out.println("builder after appending :"+builder1);
	}
	public static void main(String[] args) {
		new ClassA103().meth1();
	}

}
