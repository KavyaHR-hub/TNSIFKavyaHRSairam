package SuperKeyword;
class Vehicle{
	Vehicle(){
		System.out.println("Base Class Constructor");
	}
}
class Bike extends Vehicle{
	Bike(){
		super();
		System.out.println("Derived Class Constructor");
	}
}
class Honda extends Bike{
	Honda(){
		System.out.println("Honda Constructor");
	}
}
public class ConstructorUsage {
	public static void main(String [] args) {
		//new Vehicle();
		//new Bike();
		Honda h=new Honda();
	}

}
