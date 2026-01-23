package Regex;

public class Regex9 {
	public static void main(String[] args) {
		System.out.println("a".matches("[a-z]"));
		System.out.println("z".matches("[a-z]"));
		System.out.println("b".matches("[a-z]"));
		System.out.println("g".matches("[a-z]"));
		System.out.println("A".matches("[a-z]"));
		System.out.println("aa".matches("[a-z]"));
		System.out.println("1".matches("[a-z]"));
		System.out.println("#".matches("[a-z]"));
		
		// [a-z] -> matches onlu lowercase alphabets 
		
	}
}	
