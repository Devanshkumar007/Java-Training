package Day5;

public class Area {
	public static void main(String[] args) {
		System.out.println("Square : "+ calculateArea(10));
		System.out.println("Circle : "+ calculateArea(10.0));
		System.out.println("Rectangele : "+ calculateArea(10,20));
	}
	
	static int calculateArea(int side) {return side*side;}
	static double calculateArea(double side) {return 3.14*side*side;}
	static int calculateArea(int length , int breadth) {return length*breadth;}
}

