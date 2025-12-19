package Day2;

import java.util.Scanner;

public class DigitOrNot {
	public static void main(String[] args) {
		//jp to check given char is digit or not 
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter: ");
		char c = sc.nextLine().charAt(0);
		if( c>='0' && c<='9') System.out.println("Digit");
		else System.out.println("NOT A DIGIT");
		
	}
}
