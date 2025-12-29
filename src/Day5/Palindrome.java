package Day5;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int org = n ;
		int rev = 0 ;
		while(n>0) {
			rev = rev * 10 + n%10;
			n /= 10 ;
		}
		
		System.out.println(rev);
		if(org == rev) System.out.println(org +" is a Palindrome");
		else System.out.println(org +" is not a Palindrome");
	}
}
