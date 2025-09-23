package TNSIF1;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("a and b value before the opreators:" +a +" "+b);
		
		++a;
		int c = ++a + a + b --;
		System.out.println("c value after opreations:" +c);
		
		int d= c++ + a + b--;
		System.out.println("d value after opreations:" +d);
		
		System.out.println("a,b,c,d, values after the opreations :" +a +" "+b +" "+c +" "+d);
		
		//Ternary operator
		x=(10 == x)? 1:0;
		System.out.println(x);
		
		x=(11 == x)? 1:0;
		System.out.println(x);


	}

}