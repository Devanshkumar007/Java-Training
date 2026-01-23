package Regex;

public class Regex2 {
	public static void main(String[] args) {
		System.out.println("Drnga".matches("D+a")); // false 
		System.out.println("Dxxa".matches("Dx+a")); // false
		System.out.println("Da".matches("D+a")); // true
		System.out.println("dDa".matches("D+a")); //false
		System.out.println("DDDDDa".matches("D+a")); //true
		System.out.println("DDaaaaaa".matches("D+a")); // false
		
		System.out.println("Dxxxxxxxxa".matches("Dx+a"));
		
		
//		D+a means atleast 1 time D then a single a 
		// DDDDDa Da DDa 
	}
}
