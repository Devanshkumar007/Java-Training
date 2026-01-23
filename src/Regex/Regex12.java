package Regex;

public class Regex12 {
	public static void main(String[] args) {
		System.out.println("Cat".matches("Cat|Dog"));
		System.out.println("Dog".matches("Cat|Dog"));
		System.out.println("Cow".matches("Cat|Dog"));
		
		// .|. -> Or( | ) operator is used when to verify from 2 or more different pattern if even one is true, true is returned 
		
	}
}
