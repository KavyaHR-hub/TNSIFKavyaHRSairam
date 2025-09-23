package TNSIF2;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;
		
		System.out.println("enter customer Id:");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter customer name:");
		name = sc.nextLine();
		
		System.out.println("enter customer city:");
		city = sc.nextLine();
		
		System.out.println(" ");
		
		Customer c1 = new Customer();//Default constructor invoked
		c1.setCusId(id);
		c1.setCustomerCity(city);
		c1.setCustomername(name);
		
		System.out.println(c1);
		
		System.out.println("................");
		System.out.print("enter customer Id:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("enter customer name:");
		name = sc.nextLine();
		System.out.print("enter customer city:");
		city = sc.nextLine();
		
		Customer c2 = new Customer(name,id,city); // parameterized constructor invoked
		System.out.println(c2);
		sc.close();
		
	}
}
