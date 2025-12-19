package Day2;

import java.util.Scanner;

public class VowelOrConsonant2 {
	public static void main(String[] args) {
		
		// jp to chek whether a char is uppercase vowel or consonant or lower case vowel or consonatn 
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		if(ch >='A' && ch<='Z') {
			
			if(ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') System.out.println("UPPER CASE VOWEL") ;
				else System.out.println("UPPER CASE CONSONANT");
				
		}else if( ch>='a' && ch<='z') {
			
			if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') System.out.println("lower case vowel") ;
			else System.out.println("lower case consonant");
			
		}else {
			System.out.println("INVALID");
		}
		
	}
}
