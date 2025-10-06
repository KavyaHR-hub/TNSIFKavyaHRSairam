package TNSIF4HierarchicaIheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
	Person p1=new Person();
	System.out.println(".............person details...........");
	System.out.println(p1);
	
	Person p;
	p=new Person("kavya","banglore");
	if(p instanceof Person)
		System.out.println("Person details"+p);
	
	p = new Employee("rohit","banglore",100,50000,"IT");
	if(p instanceof Employee)
		System.out.println("Employee details"+p);
	
	p=new Student("Kavya","banglore","cse",98.9f);
	if(p instanceof Student)
		System.out.println("Student details"+p);

	}

}
