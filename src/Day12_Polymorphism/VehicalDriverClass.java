package Day12_Polymorphism;



class Vehicle{
	
	public void speedUp() {
		System.out.println("Vehicle speed = 20km");
	}
	
}

class Car extends Vehicle{
	public void speedUp() {
		System.out.println("Vehicle (Car) speed = 30km");
	}
}
class Bicycle extends Vehicle{
	public void speedUp() {
		System.out.println("Vehicle (Bicycle) speed = 15km");
	}
}


public class VehicalDriverClass {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.speedUp();
		Car c = new Car();
		c.speedUp();
		Bicycle b = new Bicycle();
		b.speedUp();
	}
}



//
//
//Q. Write a Java program to create a class Vehicle with a method called speedUp(). 
//	Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.
//
//