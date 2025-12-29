package Day5;

import java.util.Scanner;

public class PalindromeInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start ; i<=end ; i++) {
			int org = i ;
			int rev = 0 ;
			while(org>0) {
				rev = rev * 10 + org%10;
				org /= 10 ;
			}
			if(rev == i) System.out.println(rev + " is a Palindrome");
		}
	}
}
