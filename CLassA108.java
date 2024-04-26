package CoreJava;

public class CLassA108 
{
	void meth1()
	{
		System.out.println("CLassA meth called");
	}
	CLassA108()
	{
		System.out.println("classA default constrcutor");
	}
	CLassA108(String S)
	{
		this();
		System.out.println("ClassA108 parameterize constructor"+S);
	}
}
