package Regex;

public class Regex11 {
	public static void main(String[] args) {
		System.out.println("aaaaa".matches("a{2,5}"));
		System.out.println("aa".matches("a{2,5}"));
		System.out.println("aaaa".matches("a{2,5}"));
		System.out.println("aaa".matches("a{2,5}"));
		System.out.println("aaaaaa".matches("a{2,5}"));
		System.out.println("aaaaaaaa".matches("a{2,5}"));
		
		// .{n,m} -> character must be in the range of n to m    MIN:n  &  Max:m
	}
}
