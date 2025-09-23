package TNSIF1;

public class TypeCasting { //changing one data types to another data types

	public static void main(String[] args) {
		//implicit: also called as widening Casting: smaller data type is converted into a larger data type
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 22.567f;
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
		int i2 = ch;
		System.out.println(i2);
		
		//explicit:It converts a larger data type to a smaller size type
		double f1 = 10.675f;
		long l = (long) f1;
		System.out.println(l);
		
		float f2 = 54.87f;
		int i4 = (int) f2;
		System.out.println(i4);
		
		
		
	

	}

}

