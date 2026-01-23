package Regex;

public class Regex7 {
	public static void main(String[] args) {
		System.out.println(" " .matches("\\s"));
        System.out.println("\t" .matches("\\s"));
        System.out.println("\n" .matches("\\s"));
        System.out.println("a" .matches("\\s"));
        System.out.println("1" .matches("\\s"));
        System.out.println("" .matches("\\s"));
        
    //  \s 	=   matches any whitespace character such as space, tab, or newline.
	}
}
