package Regex;

public class Regex10 {
	public static void main(String[] args) {
		System.out.println("aaa".matches("a{3}"));
		System.out.println("aa".matches("a{3}"));
		System.out.println("aaaaa".matches("a{3}"));
		
		// .{n} - > means length must be exactly n
	}
}
