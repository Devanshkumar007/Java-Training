package Day8and9_OOP;

public class Processor {
	int x;
	int y;
	public void intialize() {
		System.out.println("Initialize called");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		this.x = 40 ;
		this.y = 50 ;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	public void update() {
		System.out.println("Update called");
		int x = 20 ;
		System.out.println("Local x:"+x);
		System.out.println("Global x:"+this.x);
		System.out.println("Global y:"+this.y);
	}
	
	public void display() {
		System.out.println("Display called");
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	
	public void calling() {
		System.out.println("Calling called");
		intialize();
		update();
		display();
	}
	
	public static void main(String[] args) {
		Processor obj = new Processor();
		obj.calling();
	}
}


//Write a Java program that satisfies all the following conditions:
//
//Requirements
//	1.	Create a class named Processor.
//	2.	Declare two non-static variables x and y.
//
//	4.	Initialize the instance variables only inside a non-static method using the this keyword.
//	5.	Create three non-static methods:
//	•	initialize() – assigns values to x and y using this.
//	•	update() – modifies the values of x and y and demonstrates variable shadowing by declaring a local variable with the same name as one instance variable.
//	•	display() – prints the final values of the instance variables.
//	6.	One non-static method must call another non-static method using the this keyword.