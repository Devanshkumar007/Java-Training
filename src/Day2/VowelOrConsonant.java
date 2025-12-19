package Day2;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		
		//jp to check wether the given character is vowel or consonant
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		char c = sc.nextLine().charAt(0);
		if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u' ) System.out.println("VOWEL");
		else System.out.println("Consonant");
	}
}
