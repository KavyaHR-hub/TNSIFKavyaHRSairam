
//Program to demonstrate Package, and access modifiers
package TNSIF3first;

public class Base {
	//Declaring default, public,private,protected
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//Declaring methods with default,public,private, and protected
	void methodDefault()
	{
		System.out.println("Deafult Access Base class:");
		System.out.println("Deafult variable:"+ varDefault);
	}
	void methodPublic()
	{
		System.out.println("Public Access Base class:");
		System.out.println("Public variable:"+ varPublic);
	}
	void methodPrivate()
	{
		System.out.println("Private Access Base class:");
		System.out.println("Private variable:"+ varPrivate);
	}
	void methodProtected()
	{
		System.out.println("Protected Access Base class:");
		System.out.println("Protected variable:"+ varProtected);
	}
	

}
