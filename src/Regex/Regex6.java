package Regex;

public class Regex6 {
	public static void main(String[] args) {
		 System.out.println("a" .matches("\\w"));
	     System.out.println("Z" .matches("\\w"));
	     System.out.println("5" .matches("\\w"));
	     System.out.println("_" .matches("\\w"));
	     System.out.println("@" .matches("\\w"));
	     System.out.println(" " .matches("\\w"));
	     
	     // \w-> matches letters, digits, and underscore only — no spaces or special characters.
	     
	}
}
