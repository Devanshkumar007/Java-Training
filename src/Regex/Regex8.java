package Regex;

public class Regex8 {
	public static void main(String[] args) {
		System.out.println("A".matches("[A-Z]"));
		System.out.println("D".matches("[A-Z]"));
		System.out.println("F".matches("[A-Z]"));
		System.out.println("Z".matches("[A-Z]"));
		System.out.println("a".matches("[A-Z]"));
		System.out.println("@".matches("[A-Z]"));
		System.out.println("1".matches("[A-Z]"));
		
		// [A-Z] - > matches uppercase alphabets only  
	}
}
