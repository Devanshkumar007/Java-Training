package Regex;

public class Regex1 {
	public static void main(String[] args) {
		System.out.println("Devaa".matches("D...a"));	// same length and starting and endng char true
		System.out.println("D123a".matches("D...a"));	// true
		System.out.println("Devaa".matches("D..a"));	// different length 
		System.out.println("Devaa".matches("d...a"));	// case sensitive
		
		// . mathches occurence of any character or digit or any special character ocuurence just once 
		// . does not match new line character 
	}
}
