package SuperKeyword;
class Animal{
	String color="Black";
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	String color="White";
	void print() {
		System.out.println(super.color);//Black
	}
	void eat() {
		System.out.println("Eating Bread");
	}
	void work() {
		super.eat();
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d.color);//white
		d.eat();
		d.work();
		d.print();

	}

}
