package Day2;

import java.util.Scanner;

public class IfElseLadder {
	public static void main(String[] args) {
		
		//jp to check the given character is Uppercase or lowercase , digit , special character ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("CHECK CHARACTER IS UC/LC/DIGIT/SC : ");
		char curr = sc.next().charAt(0);
				
		if( curr>='A' && curr<='Z') System.out.println(curr + " is Uppercase");
		else if( curr>='a' && curr<='z') System.out.println(curr + " is Lowercase");
		else if( curr>='0' && curr<='9') System.out.println(curr + " is Digit");
		else System.out.println(curr +" is Special Character");
	
	}
}
