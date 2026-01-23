package Regex;

public class Regex_Extra2 {
	public static void main(String[] args) {
//		Hello World -> true
//		Java 8 -> true
//		User1 Name -> true
//		Suraj Kumar -> true
//		A B -> true
//		Test Case -> true
//		Hello -> false
//		Java8 -> false
//		123 -> false
//		HelloWorld -> false
//		 Hello World -> false
//		Hello  World -> false
		
		String regex1 = "[A-Z]+[a-z]*(\\d)* [A-Z]*[a-z]*(\\d)*";
		String regex = "(\\w)* (\\w)*";
		
		System.out.println("Hello World".matches(regex)); // true
		System.out.println("Java 8".matches(regex)); //true
		System.out.println("User1 Name".matches(regex)); // true
		System.out.println("Suraj Kumar".matches(regex)); // true
		System.out.println("A B".matches(regex)); // true
		System.out.println("Test Case".matches(regex)); //true
		System.out.println("Hello".matches(regex)); // false
		System.out.println("Java8".matches(regex)); // false
		System.out.println("123".matches(regex)); // false
		System.out.println("HelloWorld".matches(regex)); // false
		System.out.println(" Hello World".matches(regex)); // false
		System.out.println("Hello  World".matches(regex)); // false
		
	}
}
