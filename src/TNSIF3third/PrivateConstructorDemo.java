//Program to demonstrate private Constructor and singleton class
package TNSIF3third;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		MyClass m1=MyClass.getObject();
		m1.getId();
		m1.setId(100);
		System.out.println(m1);

	}

}
