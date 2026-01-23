package Regex;

public class Regex3 {
	public static void main(String[] args) {
		System.out.println("DDDDa".matches("D*a")); //true
		System.out.println("a".matches("D*a")); //true
		System.out.println("Da".matches("D*a")); //true
		System.out.println("Dsafa".matches("D*a"));//false
		System.out.println("dDa".matches("D*a")); //false
		System.out.println("aa".matches("D*a")); //false
		System.out.println("DDa".matches("D*a")); // true
		
		// D*a means D may be present 0 or multiple times then acompanied by single a
		// DDDDa DDa a 
	}
}
