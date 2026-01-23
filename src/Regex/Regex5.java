package Regex;

public class Regex5 {
	public static void main(String[] args) {
		System.out.println("5".matches("\\d"));
		System.out.println("0".matches("\\d"));
		System.out.println("9".matches("\\d"));
		System.out.println("12".matches("\\d"));
		System.out.println("a".matches("\\d"));
		System.out.println(" ".matches("\\d"));
	}
}
