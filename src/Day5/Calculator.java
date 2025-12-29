package Day5;

public class Calculator {
	public static void main(String[] args) {
//		Calculator c = new Calculator();
		System.out.println(addition(1,5,8));
		System.out.println(subtraction(1,6,8,10));
		System.out.println(multiply(2,5,8));
		System.out.println(addition("Devansh ","Kumar"));
	}
	
	public static int addition(int a, int b, int c) {
		return a+b+c;
	}

	public static int subtraction(int a, int b, int c, int d) {
		return a-b-c-d;
	}
	
	public static int multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	public static String addition(String a, String b) {
		return a+b;
	}
}
